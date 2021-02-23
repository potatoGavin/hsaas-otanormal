package com.hemily.hsaasotanormal.interceptor;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.hemily.hsaasotanormal.base.APIResult;
import com.hemily.hsaasotanormal.dto.OTAMerchantInfo;
import com.hemily.hsaasotanormal.utils.RedisUtil;
import com.hemily.hsaasotanormal.utils.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.time.Duration;
import java.time.LocalDateTime;

public class AuthInterceptor implements HandlerInterceptor {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private RedisUtil redisUtil;

    /**
     * 调用控制器方法之前
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        APIResult result = helperCheckParam(request);
        if (result.code != 200) {
            //记录到日志
            return false;
        }

        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    /**
     * 不管是否发生异常，最终都会进入此方法，用于资源清理
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        System.out.printf("come here AuthInterceptor afterCompletion ====>");

        //需要记录响应信息到日志

    }

    /**
     * 请求参数验证
     *
     * @param request
     * @return
     * @Todo 异常信息需要记录到日志
     */
    private APIResult helperCheckParam(HttpServletRequest request) {
        try {
            String parkCode = request.getParameter("park");
            String account = request.getParameter("account");
            String timestamp = request.getParameter("time");
            String uuid = request.getParameter("nonce");
            String sign = request.getParameter("sign");


            //参数非空验证
            if (StrUtil.isNullOrEmpty(parkCode)) {
                return APIResult.waringParamDefect("景区编码");
            }

            if (StrUtil.isNullOrEmpty(account)) {
                return APIResult.waringParamDefect("OTA账号");
            }

            if (StrUtil.isNullOrEmpty(timestamp)) {
                return APIResult.waringParamDefect("时间戳");
            }

            if (StrUtil.isNullOrEmpty(uuid)) {
                return APIResult.waringParamDefect("请求uuid");
            }

            if (StrUtil.isNullOrEmpty(sign)) {
                return APIResult.waringParamDefect("请求签名");
            }

            //请求安全验证

            Object redis_nonce = redisUtil.get("normal_request_nonce" + parkCode + "_" + account + uuid);
            if (redis_nonce != null && StrUtil.isNullOrEmpty(redis_nonce.toString())) {
                return APIResult.waringParamError("重复的请求");
            }

            //注意要写入到日志中
            redisUtil.set("normal_request_nonce" + parkCode + "_" + account + uuid, uuid, 60);

            if (!StrUtil.isTimeStamp(timestamp)) {
                return APIResult.waringParamError("无效到时间戳");
            }

            // 时间戳误差不能超过120秒
            LocalDateTime timeReq = StrUtil.convertToDate(Long.valueOf(timestamp));
            if (Duration.between(timeReq, LocalDateTime.now()).toMillis() > 120000) {
                return APIResult.waringParamError("时间戳已过期");
            }

            OTAMerchantInfo ota = (OTAMerchantInfo) redisUtil.hget("otainfo", account);
            if (ota == null) {
                return APIResult.waringParamError("OTA账号错误");
            }

            // MD5(景区编码+OTA账号+时间戳+uuid+OTA接口秘钥)
            String preMd5 = parkCode + account + timestamp + ota.merchantKey;
            if (StrUtil.getMd5(preMd5).toLowerCase() != sign.toLowerCase()) {
                return APIResult.waringParamError("签名错误");
            }

            return APIResult.success(null);
        } catch (Exception ex) {
            return APIResult.error();
        }

    }


    /**
     * 转义拦截响应信息
     * @param response
     * @param json
     */
    private void helperRenderJson(HttpServletResponse response, String json) {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        try (PrintWriter writer = response.getWriter()) {
            writer.print(json);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
