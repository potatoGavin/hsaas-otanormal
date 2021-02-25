package com.hemily.hsaasotanormal.dto.request;

public class InProduct extends InBase {

    /**
     * 门票生效时间
     * 格式：yyyyMMdd
     */
    public String startDate;

    /**
     * 门票生效时间
     * 格式：yyyyMMdd
     */
    public String endDate;

    /**
     * 门票Id
     * 如果查询所有产品，则不传或者传0
     */
    public String productId;

    public InProduct() {
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
