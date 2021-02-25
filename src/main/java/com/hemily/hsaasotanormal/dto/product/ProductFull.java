package com.hemily.hsaasotanormal.dto.product;

/**
 * 产品完整属性，订单相关校验使用
 */
public class ProductFull {

    /**
     * 产品发布Id
     * nl_release_id
     */
    public long releaseId;

    /**
     * 所属商户Id
     * nl_merchant_id
     */
    public long merchantId;

    /**
     * 所属渠道Id
     * nl_channel_id
     */
    public long channelId;

    /**
     * 产品类型Id
     * nl_product_type
     */
    public long productTypeId;

    /**
     * 线下编码
     * si_offline_code
     */
    public String offlineCode;

    /**
     * 是否发送短信
     * ni_service_sms
     */
    public int serviceSms;

    /**
     * 退款需要线下校验
     * ni_refund_limit_offline
     */
    public int refundLimitOffline;


}
