package com.hemily.hsaasotanormal.controller;

import com.hemily.hsaasotanormal.dto.APIResult;
import com.hemily.hsaasotanormal.dto.ServiceResult;
import com.hemily.hsaasotanormal.dto.product.ProductRsp;
import com.hemily.hsaasotanormal.dto.request.InProduct;
import com.hemily.hsaasotanormal.service.ProductService;
import com.hemily.hsaasotanormal.utils.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 业务逻辑接口
 * 请求参数都在请求体中
 */
@RestController
@RequestMapping("api")
public class BussinessController extends BaseController {

    /**
     * 产品DI映射
     */
    @Autowired
    private ProductService productService;

    /**
     * 获取门票信息
     * todo:// 对于result的log结果需要记录到日志
     *
     * @param inProduct 请求参数
     * @return
     */
    @PostMapping("product")
    public APIResult get_product(@RequestBody InProduct inProduct) {


        try {
            if (inProduct == null) {
                return APIResult.waringParamError("无获取到请求参数");
            }

            if (StrUtil.isNullOrEmpty(inProduct.startDate)) {
                return APIResult.waringParamError("缺少生效时间");
            }

            if (StrUtil.isNullOrEmpty(inProduct.endDate)) {
                return APIResult.waringParamError("缺少失效时间");
            }

            if (!StrUtil.isDate(inProduct.startDate, "yyyyMMdd")) {
                return APIResult.waringParamError("无效的生效时间");
            }

            if (!StrUtil.isDate(inProduct.startDate, "yyyyMMdd")) {
                return APIResult.waringParamError("无效的失效时间");
            }

            LocalDateTime st = StrUtil.toDateTime(inProduct.startDate, "yyyy-MM-dd 00:00:00");
            LocalDateTime et = StrUtil.toDateTime(inProduct.endDate, "yyyy-MM-dd 23:59:59");

            if (LocalDateTime.now().isAfter(st)) {
                return APIResult.waringParamError("开始时间不能小于当前时间");
            }

            if (st.isAfter(et)) {
                return APIResult.waringParamError("结束时间不能小于开始时间");
            }

            if (Duration.between(st, et).toDays() > 60) {
                return APIResult.waringParamError("查询周期不能超过60天");
            }

            if (!StrUtil.isNullOrEmpty(inProduct.productId) && !StrUtil.islong(inProduct.productId)) {
                return APIResult.waringParamError("产品Id格式不正确");
            }

            // 获取产品信息
            long pid = StrUtil.isNullOrEmpty(inProduct.productId) ? 0L : Long.parseLong(inProduct.productId);
            ServiceResult result = productService.getlist_product(inProduct.parkId, inProduct.otaId, st, et, pid);

            if (!result.flag) {
                return APIResult.waring(result.msg);
            }


            if (result.flag && result.data == null || ((List<ProductRsp>) result.data).size() <= 0) {
                return APIResult.waringProtocol();
            }

            //todo
            return APIResult.success(result.data);
        } catch (Exception ex) {
            //todo ex.getmessage() 需要记录
            return APIResult.error();
        }

    }


}
