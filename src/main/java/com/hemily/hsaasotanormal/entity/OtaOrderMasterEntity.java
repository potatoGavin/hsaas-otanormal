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
 ota订单主表(ota_order_master)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="ota_order_master")
public class OtaOrderMasterEntity {
	 /** 
	  * 订单号
	  */
	 @TableId(value="si_orderno",type= IdType.AUTO)
	 private String siOrderno;

 	 /** 
	  * ota订单号
	  */
	 private String siOrdernoOta;

 	 /** 
	  * 商户Id
	  */
	 private Long nlMerchantId;

 	 /** 
	  * 渠道Id
	  */
	 private Long nlChannelId;

 	 /** 
	  * 游玩日期
	  */
	 private Date tsPlay;

 	 /** 
	  * 支付状态：0-未支付,1-已支付
	  */
	 private Integer niStatus;

 	 /** 
	  * 订单金额(结算价)
	  */
	 private Integer niAmtSettle;

 	 /** 
	  * 订单金额(售卖价)
	  */
	 private Integer niAmtSell;

 	 /** 
	  * 创建时间
	  */
	 private Date tsCreateTime;

 }