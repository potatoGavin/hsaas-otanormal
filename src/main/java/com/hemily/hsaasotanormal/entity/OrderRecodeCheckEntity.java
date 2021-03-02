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
 核销记录表(order_recode_check)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="order_recode_check")
public class OrderRecodeCheckEntity {
	 /** 
	  * 记录Id
	  */
	 @TableId(value="nl_check_id",type= IdType.AUTO)
	 private Long nlCheckId;

 	 /** 
	  * 商户Id
	  */
	 private Long nlMerchantId;

 	 /** 
	  * 订单号
	  */
	 private String siOrderno;

 	 /** 
	  * 凭证码
	  */
	 private String siEcode;

 	 /** 
	  * 核销数量
	  */
	 private Integer niQtyCheck;

 	 /** 
	  * 核销时间
	  */
	 private Date tsCheckTime;

 	 /** 
	  * 核销终端
	  */
	 private Integer niCheckTerminal;

 	 /** 
	  * 核销类型：1-取票核销,2-闸机核销
	  */
	 private Integer niCheckType;

 	 /** 
	  * 操作备注
	  */
	 private Integer niRemark;

 }