package com.hemily.hsaasotanormal.dto;


/**
 * redis存储的商户信息
 */
public class OTAMerchantInfo {
    public long merchantId;
    public String merchantCode;
    public Integer merchantType;
    public String merchantKey;
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


    @Override
    public String toString() {
        return "MerchantInfo{" +
                "merchantId=" + merchantId +
                ", merchantCode='" + merchantCode + '\'' +
                ", merchantType=" + merchantType +
                ", merchantKey='" + merchantKey + '\'' +
                ", otaAccuount='" + otaAccuount + '\'' +
                '}';
    }
}
