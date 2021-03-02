package com.hemily.hsaasotanormal.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="ops_product_release_ota")
public class OpsProductReleaseOtaEntity {
	 @TableId(value="nl_release_id",type= IdType.AUTO)
	 private Long nlReleaseId;
 	 private Long nlProductId;
 	 private Integer niProductCode;
 	 private Long nlMerchantId;
 	 private Long nlChannelId;
 	 private String siProductDisplay;
 	 private Long nlProductType;
 	 private String siOfflineCode;
 	 private Integer niPriceTicket;
 	 private Integer niPriceSell;
 	 private Integer niPriceSettle;
 	 private Date tsEffectiveSt;
 	 private Date tsEffectiveEt;
 	 private Integer niSellPreEnabled;
 	 private Date tsSellPreSt;
 	 private Date tsSellPreEt;
 	 private Integer niSellTodayEnabled;
 	 private Date tsSellTodayMaxtime;
 	 private Integer niSellOrderMin;
 	 private Integer niSellOrderMax;
 	 private Integer niRefundEnabled;
 	 private Integer niRefundLimit;
 	 private Integer niRefundLimitToday;
 	 private Integer niRefundLimitDeadline;
 	 private Integer niRefundLimitOffline;
 	 private String siRefundLimitUrl;
 	 private Integer niCkDelayHour;
 	 private Integer niCkTicketType;
 	 private Integer niCkPriceType;
 	 private Integer niCkDateticket;
 	 private Integer niCkDateticketDays;
 	 private Date tsCkDateticketSt;
 	 private Date tsCkDateticketEt;
 	 private Integer niServiceSms;
 	 private String siCreateUser;
 	 private Date tsCreateTime;
 	 private String siUpdateUser;
 	 private String siUpdateTime;
 }