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
 订单凭证码记录表(order_recode_ecode)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="order_recode_ecode")
public class OrderRecodeEcodeEntity {
	 /** 
	  * 记录明细Id
	  */
	 @TableId(value="nl_detail_id",type= IdType.AUTO)
	 private Long nlDetailId;

 	 /** 
	  * 记录Id
	  */
	 private Long nlRecodeId;

 	 /** 
	  * 订单号
	  */
	 private String siOrderno;

 	 /** 
	  * 凭证码
	  */
	 private String siEcode;

 	 /** 
	  * 产品Id
	  */
	 private Long nlProductId;

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