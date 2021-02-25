package com.hemily.hsaasotanormal.dto.redis;

import java.util.Date;

/**
 * 合作协议表
 */
public class ProtocolRedis {

    /**
     * 协议Id
     */
    public String protocolId;

    /**
     * 景区商户Id
     */
    public String merchantId;

    /**
     * 景区编码
     */
    public String merchantCode;

    /**
     * 景区名称
     */
    public String merchantName;

    /**
     * OTA商户Id
     */
    public String channelId;

    /**
     * OTA编码
     */
    public String channelCode;

    /**
     * OTA名称
     */
    public String channelName;

    /**
     * 生效时间
     */
    public Date effectiveSt;

    /**
     * 失效时间
     */
    public Date effectiveEt;

    /**
     * 是否启用
     */
    public Integer isEnabled;

    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
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

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Date getEffectiveSt() {
        return effectiveSt;
    }

    public void setEffectiveSt(Date effectiveSt) {
        this.effectiveSt = effectiveSt;
    }

    public Date getEffectiveEt() {
        return effectiveEt;
    }

    public void setEffectiveEt(Date effectiveEt) {
        this.effectiveEt = effectiveEt;
    }

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Override
    public String toString() {
        return "ProtocolInfo{" +
                "protocolId='" + protocolId + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", merchantCode='" + merchantCode + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", channelId='" + channelId + '\'' +
                ", channelCode='" + channelCode + '\'' +
                ", channelName='" + channelName + '\'' +
                ", effectiveSt=" + effectiveSt +
                ", effectiveEt=" + effectiveEt +
                ", isEnabled=" + isEnabled +
                '}';
    }
}
