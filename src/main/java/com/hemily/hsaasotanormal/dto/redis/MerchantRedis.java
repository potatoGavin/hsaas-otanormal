package com.hemily.hsaasotanormal.dto.redis;


/**
 * redis存储的商户信息
 */
public class MerchantRedis {
    /**
     * 商户Id
     */
    public long merchantId;

    /**
     * 商户编码
     */
    public String merchantCode;

    /**
     * 商户名称
     */
    public String merchantName;

    /**
     * 商户类型：10-景区，21-ota,22-旅行社
     */
    public Integer merchantType;

    /**
     * 商户密钥
     */
    public String merchantKey;

    /**
     * ota账号
     * 景区类型时,无此属性
     */
    public String otaAccuount;


    public long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(long merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public Integer getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(Integer merchantType) {
        this.merchantType = merchantType;
    }

    public String getMerchantKey() {
        return merchantKey;
    }

    public void setMerchantKey(String merchantKey) {
        this.merchantKey = merchantKey;
    }

    public String getOtaAccuount() {
        return otaAccuount;
    }

    public void setOtaAccuount(String otaAccuount) {
        this.otaAccuount = otaAccuount;
    }
}
