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
@TableName(value="ota_order_customer")
public class OtaOrderCustomerEntity {
	 @TableId(value="nl_customer_id",type= IdType.AUTO)
	 private Long nlCustomerId;
 	 private String siOrderno;
 	 private String siName;
 	 private String siPhone;
 	 private String siIdcard;
 	 private Date tsCreateTime;
 }