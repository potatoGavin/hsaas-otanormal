package com.hemily.hsaasotanormal.dto;

/**
 * 服务统一响应规则
 */
public class APIResult {

    /**
     * 响应码
     * 200-成功，其他都是失败
     */
    public int code;

    /**
     * 响应描述
     */
    public String msg;

    /**
     * 响应数据
     */
    public Object data;

    public APIResult() {
    }

    public APIResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 接口响应成功
     *
     * @param _data 响应数据
     * @return
     */
    public static APIResult success(Object _data) {
        return new APIResult(200, "请求成功", _data);
    }

    /**
     * 接口内部发生异常
     *
     * @return
     */
    public static APIResult error() {
        return new APIResult(999, "接口内部异常(联系技术人员)", null);
    }

    /**
     * 响应失败
     *
     * @param _code 响应码
     * @param _msg  描述信息
     * @return
     */
    public static APIResult waring(Integer _code, String _msg) {
        return new APIResult(_code, _msg, null);
    }

    /**
     * 参数缺失
     *
     * @param _msg 具体缺少到参数
     * @return
     */
    public static APIResult waringParamDefect(String _msg) {
        _msg = "请求参数缺失(无" + _msg + ")";
        return new APIResult(2110, _msg, null);
    }

    /**
     * 参数错误
     *
     * @param _msg 具体错误原因
     * @return
     */
    public static APIResult waringParamError(String _msg) {
        _msg = "参数错误" + _msg;
        return new APIResult(2120, _msg, null);
    }

    /**
     * 合作协议不存在
     *
     * @return
     */
    public static APIResult waringProtocol() {
        return new APIResult(2210, "合作协议不存在(请联系景区进行签约)", null);
    }

    /**
     * 财务账户不存在
     *
     * @return
     */
    public static APIResult waringProtocolFinance() {
        return new APIResult(2211, "财务账户不存在(请联系景区进行开通)", null);
    }

    /**
     * 产品不存在
     *
     * @return
     */
    public static APIResult waringProtocolProduct() {
        return new APIResult(2211, "未查询到有效产品(产品已下架或已过期，请联系景区配置产品)", null);
    }


    // get set 方法
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
