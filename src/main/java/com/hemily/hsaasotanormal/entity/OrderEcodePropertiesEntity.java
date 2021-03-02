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
 凭证码同步表(order_ecode_properties)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="order_ecode_properties")
public class OrderEcodePropertiesEntity {
	 /** 
	  * 凭证码
	  */
	 @TableId(value="si_ecode",type= IdType.AUTO)
	 private String siEcode;

 	 /** 
	  * 商户Id
	  */
	 private Long nlMerchantId;

 	 /** 
	  * 渠道Id
	  */
	 private Long nlChannelId;

 	 /** 
	  * 已核销数量
	  */
	 private Integer niQtyUse;

 	 /** 
	  * 普通退款数量
	  */
	 private Integer niQtyRefundNormal;

 	 /** 
	  * 强制退款数量
	  */
	 private Integer niQtyRefundForce;

 	 /** 
	  * 凭证码状态：0-未支付,10-已支付,20-已核销,30-已退款,40-已作废
	  */
	 private Integer niCodeStatus;

 	 /** 
	  * 是否取票
	  */
	 private Integer niStatusTicket;

 	 /** 
	  * 是否核销
	  */
	 private Integer niStatusCheck;

 	 /** 
	  * 取票时间
	  */
	 private Date tsTimeTicket;

 	 /** 
	  * 最新核销时间
	  */
	 private Date tsTimeCheck;

 }