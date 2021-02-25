package com.hemily.hsaasotanormal.dto.request;

import org.springframework.web.bind.annotation.RequestBody;

public class InProduct extends InBase {

    /**
     * 门票生效时间
     */
    public String startDate;

    /**
     * 门票生效时间
     */
    public String endDate;

    /**
     * 门票Id
     */
    public String productId;

    public InProduct(){
        super();
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "InProduct{" +
                "startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", productId='" + productId + '\'' +
                ", parkId=" + parkId +
                ", parkName='" + parkName + '\'' +
                ", parkCode='" + parkCode + '\'' +
                ", otaId=" + otaId +
                ", otaName='" + otaName + '\'' +
                ", otaCode='" + otaCode + '\'' +
                ", otaAccount='" + otaAccount + '\'' +
                '}';
    }
}
