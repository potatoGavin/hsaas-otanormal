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
 ota订单游客信息(ota_order_customer)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="ota_order_customer")
public class OtaOrderCustomerEntity {
	 /** 
	  * 订单游客Id
	  */
	 @TableId(value="nl_customer_id",type= IdType.AUTO)
	 private Long nlCustomerId;

 	 /** 
	  * 订单号
	  */
	 private String siOrderno;

 	 /** 
	  * 姓名
	  */
	 private String siName;

 	 /** 
	  * 手机号
	  */
	 private String siPhone;

 	 /** 
	  * 证件号
	  */
	 private String siIdcard;

 	 /** 
	  * 创建时间
	  */
	 private Date tsCreateTime;

 }