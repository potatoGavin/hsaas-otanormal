package com.hemily.hsaasotanormal.dto.product;

import com.fasterxml.jackson.annotation.JsonFormat;
import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.Date;
import java.util.List;

/**
 * 响应产品信息
 */
public class ProductRsp {

    /**
     * 产品Id
     * 数据库字段：nl_product_id
     */
    public long productId;

    /**
     * 产品名称
     * 数据库字段：si_product_display
     */
    public String productName;

    /**
     * 产品类型
     * 数据库字段：nl_product_type
     */
    public String productType;

    /**
     * 票面价
     * 数据库字段：ni_price_ticket
     */
    public double priceTicket;

    /**
     * 售卖价
     * 数据库字段：ni_price_sell
     */
    public double priceSell;

    /**
     * 结算价
     * 数据库字段：ni_price_settle
     */
    public double priceSettle;

    /**
     * 生效时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public Date startTime;

    /**
     * 失效时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public Date endTime;

    /**
     * 是否开启预售
     * ni_sell_pre_enabled
     */
    public int sellPreEnabled;

    /**
     * 预售生效时间
     * ts_sell_pre_st
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public Date sellPreEt;

    /**
     * 预售失效时间
     * ts_sell_pre_et
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    public Date sellPreSt;

    /**
     * 当日是否可购
     * ni_sell_today_enabled
     */
    public int sellTodayEnabled;

    /**
     * 当日最晚可购时间
     * ts_sell_today_maxtime
     */
    public String sellTodayMaxTime;

    /**
     * 单笔购票最小数量
     * ni_sell_order_min
     */
    public int sellOrderMin;

    /**
     * 单笔购票最大数量
     * ni_sell_order_max
     */
    public int sellOrderMax;

    /**
     * 是否可退
     * ni_refund_enabled
     */
    public int refundEnabled;

    /**
     * 退款需要审核
     * ni_refund_limit
     */
    public int refundLimit;

    /**
     * 当日是否可退
     * ni_refund_limit_today
     */
    public int refundLimitToday;

    /**
     * 过期多少天内可退
     * ni_refund_limit_deadline
     */
    public int refundLimitDeadline;

    /**
     * 延迟入园时长
     * 数据库字段：ni_ck_delay_hour
     */
    public int ckDelayHour;

    /**
     * 大小票:1-大票,2-小票
     * 数据库字段：ni_ck_ticket_type
     */
    public int ckTicketType;

    /**
     * 期票：1-固定天数,2-指定日期
     * 数据库字段：ni_ck_dateticket
     */
    public int ckDateTicket;

    /**
     * 期票固定天数
     * 数据库字段：ni_ck_dateticket_days
     */
    public int ckDateTicetDays;

    /**
     * 期票指定生效日期
     * 数据库字段：ts_ck_dateticket_st
     */
    public String ckDateTicketSt;

    /**
     * 期票指定失效日期
     * 数据库字段：ts_ck_dateticket_et
     */
    public String ckDateTicketEt;

    /**
     * 周期价
     * 数据库字段：ni_ck_price_type
     */
    @Ignore
    public int ckPriceType;

    /**
     * 价格日历
     */
    public List<ProductCyclePrice> calendarDates;

    public int getCkPriceType() {
        return ckPriceType;
    }

    public void setCkPriceType(int ckPriceType) {
        this.ckPriceType = ckPriceType;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public double getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(double priceTicket) {
        this.priceTicket = priceTicket;
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getSellPreEnabled() {
        return sellPreEnabled;
    }

    public void setSellPreEnabled(int sellPreEnabled) {
        this.sellPreEnabled = sellPreEnabled;
    }

    public Date getSellPreEt() {
        return sellPreEt;
    }

    public void setSellPreEt(Date sellPreEt) {
        this.sellPreEt = sellPreEt;
    }

    public Date getSellPreSt() {
        return sellPreSt;
    }

    public void setSellPreSt(Date sellPreSt) {
        this.sellPreSt = sellPreSt;
    }

    public int getSellTodayEnabled() {
        return sellTodayEnabled;
    }

    public void setSellTodayEnabled(int sellTodayEnabled) {
        this.sellTodayEnabled = sellTodayEnabled;
    }

    public String getSellTodayMaxTime() {
        return sellTodayMaxTime;
    }

    public void setSellTodayMaxTime(String sellTodayMaxTime) {
        this.sellTodayMaxTime = sellTodayMaxTime;
    }

    public int getSellOrderMin() {
        return sellOrderMin;
    }

    public void setSellOrderMin(int sellOrderMin) {
        this.sellOrderMin = sellOrderMin;
    }

    public int getSellOrderMax() {
        return sellOrderMax;
    }

    public void setSellOrderMax(int sellOrderMax) {
        this.sellOrderMax = sellOrderMax;
    }

    public int getRefundEnabled() {
        return refundEnabled;
    }

    public void setRefundEnabled(int refundEnabled) {
        this.refundEnabled = refundEnabled;
    }

    public int getRefundLimit() {
        return refundLimit;
    }

    public void setRefundLimit(int refundLimit) {
        this.refundLimit = refundLimit;
    }

    public int getRefundLimitToday() {
        return refundLimitToday;
    }

    public void setRefundLimitToday(int refundLimitToday) {
        this.refundLimitToday = refundLimitToday;
    }

    public int getRefundLimitDeadline() {
        return refundLimitDeadline;
    }

    public void setRefundLimitDeadline(int refundLimitDeadline) {
        this.refundLimitDeadline = refundLimitDeadline;
    }

    public int getCkDelayHour() {
        return ckDelayHour;
    }

    public void setCkDelayHour(int ckDelayHour) {
        this.ckDelayHour = ckDelayHour;
    }

    public int getCkTicketType() {
        return ckTicketType;
    }

    public void setCkTicketType(int ckTicketType) {
        this.ckTicketType = ckTicketType;
    }

    public int getCkDateTicket() {
        return ckDateTicket;
    }

    public void setCkDateTicket(int ckDateTicket) {
        this.ckDateTicket = ckDateTicket;
    }

    public int getCkDateTicetDays() {
        return ckDateTicetDays;
    }

    public void setCkDateTicetDays(int ckDateTicetDays) {
        this.ckDateTicetDays = ckDateTicetDays;
    }

    public String getCkDateTicketSt() {
        return ckDateTicketSt;
    }

    public void setCkDateTicketSt(String ckDateTicketSt) {
        this.ckDateTicketSt = ckDateTicketSt;
    }

    public String getCkDateTicketEt() {
        return ckDateTicketEt;
    }

    public void setCkDateTicketEt(String ckDateTicketEt) {
        this.ckDateTicketEt = ckDateTicketEt;
    }

    public ProductRsp() {
    }

    @Override
    public String toString() {
        return "ProductRsp{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", priceTicket=" + priceTicket +
                ", priceSell=" + priceSell +
                ", priceSettle=" + priceSettle +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", sellPreEnabled=" + sellPreEnabled +
                ", sellPreEt=" + sellPreEt +
                ", sellPreSt=" + sellPreSt +
                ", sellTodayEnabled=" + sellTodayEnabled +
                ", sellTodayMaxTime='" + sellTodayMaxTime + '\'' +
                ", sellOrderMin=" + sellOrderMin +
                ", sellOrderMax=" + sellOrderMax +
                ", refundEnabled=" + refundEnabled +
                ", refundLimit=" + refundLimit +
                ", refundLimitToday=" + refundLimitToday +
                ", refundLimitDeadline=" + refundLimitDeadline +
                ", ckDelayHour=" + ckDelayHour +
                ", ckTicketType=" + ckTicketType +
                ", ckDateTicket=" + ckDateTicket +
                ", ckDateTicetDays=" + ckDateTicetDays +
                ", ckDateTicketSt='" + ckDateTicketSt + '\'' +
                ", ckDateTicketEt='" + ckDateTicketEt + '\'' +
                '}';
    }
}
