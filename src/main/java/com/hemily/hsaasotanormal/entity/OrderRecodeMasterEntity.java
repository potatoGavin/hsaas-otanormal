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
 订单记录表(order_recode_master)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="order_recode_master")
public class OrderRecodeMasterEntity {
	 /** 
	  * 记录Id
	  */
	 @TableId(value="nl_recode_id",type= IdType.AUTO)
	 private Long nlRecodeId;

 	 /** 
	  * 订单号
	  */
	 private String siOrderno;

 	 /** 
	  * 商户Id
	  */
	 private Long nlMerchantId;

 	 /** 
	  * 渠道Id
	  */
	 private Long nlChannelId;

 	 /** 
	  * 操作类型：1-创建,20-支付,30-反审,40-修改,60-核销,70-退票
	  */
	 private Integer niRecodeType;

 	 /** 
	  * 创建时间
	  */
	 private Date tsCreateTime;

 	 /** 
	  * 操作人
	  */
	 private Integer niCreateUser;

 	 /** 
	  * 操作备注
	  */
	 private Integer niRemark;

 }