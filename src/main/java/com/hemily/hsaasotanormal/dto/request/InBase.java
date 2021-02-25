package com.hemily.hsaasotanormal.dto.request;

/**
 * 所有请求参数的基类
 * 所有请求参数的类名用In开头
 */
public class InBase {

    /**
     * 景区商户ID
     */
    public long parkId;

    /**
     * 景区商户名称
     */
    public String parkName;

    /**
     * 景区商户编码
     */
    public String parkCode;

    /**
     * OTA商户ID
     */
    public long otaId;

    /**
     * OTA商户名称
     */
    public String otaName;

    /**
     * OTA商户编码
     */
    public String otaCode;

    /**
     * OTA接口账号
     */
    public String otaAccount;

    public long getParkId() {
        return parkId;
    }

    public void setParkId(long parkId) {
        this.parkId = parkId;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public String getParkCode() {
        return parkCode;
    }

    public void setParkCode(String parkCode) {
        this.parkCode = parkCode;
    }

    public long getOtaId() {
        return otaId;
    }

    public void setOtaId(long otaId) {
        this.otaId = otaId;
    }

    public String getOtaName() {
        return otaName;
    }

    public void setOtaName(String otaName) {
        this.otaName = otaName;
    }

    public String getOtaCode() {
        return otaCode;
    }

    public void setOtaCode(String otaCode) {
        this.otaCode = otaCode;
    }

    public String getOtaAccount() {
        return otaAccount;
    }

    public void setOtaAccount(String otaAccount) {
        this.otaAccount = otaAccount;
    }

    @Override
    public String toString() {
        return "InBase{" +
                "parkId=" + parkId +
                ", parkName='" + parkName + '\'' +
                ", parkCode='" + parkCode + '\'' +
                ", otaId=" + otaId +
                ", otaName='" + otaName + '\'' +
                ", otaCode='" + otaCode + '\'' +
                ", otaAccount='" + otaAccount + '\'' +
                '}';
    }
}
