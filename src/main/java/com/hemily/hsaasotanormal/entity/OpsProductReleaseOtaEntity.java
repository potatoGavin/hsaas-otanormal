package com.hemily.hsaasotanormal.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

 /**
 ota产品发布表(ops_product_release_ota)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="ops_product_release_ota")
public class OpsProductReleaseOtaEntity {
	 /** 
	  * 发布Id
	  */
	 @TableId(value="nl_release_id",type= IdType.AUTO)
	 private Long nlReleaseId;

 	 /** 
	  * 产品Id
	  */
	 private Long nlProductId;

 	 /** 
	  * 产品编码
	  */
	 private Integer niProductCode;

 	 /** 
	  * 所属商户Id
	  */
	 private Long nlMerchantId;

 	 /** 
	  * 所属渠道Id
	  */
	 private Long nlChannelId;

 	 /** 
	  * 显示名称
	  */
	 private String siProductDisplay;

 	 /** 
	  * 产品类型
	  */
	 private Long nlProductType;

 	 /** 
	  * 线下编码
	  */
	 private String siOfflineCode;

 	 /** 
	  * 票面价
	  */
	 private Double niPriceTicket;

 	 /** 
	  * 售卖价
	  */
	 private Double niPriceSell;

 	 /** 
	  * 结算价
	  */
	 private Double niPriceSettle;

 	 /** 
	  * 生效时间
	  */
	 private Date tsEffectiveSt;

 	 /** 
	  * 失效时间
	  */
	 private Date tsEffectiveEt;

 	 /** 
	  * 是否开启预售
	  */
	 private Integer niSellPreEnabled;

 	 /** 
	  * 预售生效时间
	  */
	 private Date tsSellPreSt;

 	 /** 
	  * 预售失效时间
	  */
	 private Date tsSellPreEt;

 	 /** 
	  * 当日是否可购
	  */
	 private Integer niSellTodayEnabled;

 	 /** 
	  * 当日最晚可购时间
	  */
	 private Date tsSellTodayMaxtime;

 	 /** 
	  * 单笔购票最小数量
	  */
	 private Integer niSellOrderMin;

 	 /** 
	  * 单笔购票最大数量
	  */
	 private Integer niSellOrderMax;

 	 /** 
	  * 是否可退
	  */
	 private Integer niRefundEnabled;

 	 /** 
	  * 退款需要审核
	  */
	 private Integer niRefundLimit;

 	 /** 
	  * 当日是否可退
	  */
	 private Integer niRefundLimitToday;

 	 /** 
	  * 过期多少天内可退
	  */
	 private Integer niRefundLimitDeadline;

 	 /** 
	  * 退款需要线下校验
	  */
	 private Integer niRefundLimitOffline;

 	 /** 
	  * 退款线下校验地址
	  */
	 private String siRefundLimitUrl;

 	 /** 
	  * 延迟入园时长
	  */
	 private Integer niCkDelayHour;

 	 /** 
	  * 大小票:1-大票,2-小票
	  */
	 private Integer niCkTicketType;

 	 /** 
	  * 周期价：1-开启
	  */
	 private Double niCkPriceType;

 	 /** 
	  * 期票：1-固定天数,2-指定日期
	  */
	 private Integer niCkDateticket;

 	 /** 
	  * 期票固定天数
	  */
	 private Integer niCkDateticketDays;

 	 /** 
	  * 期票指定生效日期
	  */
	 private Date tsCkDateticketSt;

 	 /** 
	  * 期票指定失效日期
	  */
	 private Date tsCkDateticketEt;

 	 /** 
	  * 是否发送短信
	  */
	 private Integer niServiceSms;

 	 /** 
	  * 创建人
	  */
	 private String siCreateUser;

 	 /** 
	  * 创建时间
	  */
	 private Date tsCreateTime;

 	 /** 
	  * 更新人
	  */
	 private String siUpdateUser;

 	 /** 
	  * 更新时间
	  */
	 private Date tsUpdateTime;

 }