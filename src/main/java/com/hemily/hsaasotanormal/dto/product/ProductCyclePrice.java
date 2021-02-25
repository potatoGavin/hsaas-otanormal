package com.hemily.hsaasotanormal.dto.product;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 产品周期价
 */
public class ProductCyclePrice {

    /**
     * 产品Id
     * nl_product_id
     */
    public long productId;

    /**
     * 售卖价
     * ni_price_sell
     */
    public double priceSell;

    /**
     * 结算价
     * ni_price_settle
     */
    public double priceSettle;

    /**
     * 有效日期
     * ts_date
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public LocalDateTime calendarDate;


    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public double getPriceSell() {
        return priceSell;
    }

    public void setPriceSell(double priceSell) {
        this.priceSell = priceSell;
    }

    public double getPriceSettle() {
        return priceSettle;
    }

    public void setPriceSettle(double priceSettle) {
        this.priceSettle = priceSettle;
    }

    public LocalDateTime getCalendarDate() {
        return calendarDate;
    }

    public void setCalendarDate(LocalDateTime calendarDate) {
        this.calendarDate = calendarDate;
    }

    public ProductCyclePrice() {
    }

    @Override
    public String toString() {
        return "ProductCyclePrice{" +
                "productId=" + productId +
                ", priceSell=" + priceSell +
                ", priceSettle=" + priceSettle +
                ", cenderDate=" + calendarDate +
                '}';
    }
}
