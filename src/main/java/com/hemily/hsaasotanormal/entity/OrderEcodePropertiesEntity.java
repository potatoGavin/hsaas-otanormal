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
@TableName(value="order_ecode_properties")
public class OrderEcodePropertiesEntity {
	 @TableId(value="si_ecode",type= IdType.AUTO)
	 private String siEcode;
 	 private Long nlMerchantId;
 	 private Long nlChannelId;
 	 private Integer niQtyUse;
 	 private Integer niQtyRefundNormal;
 	 private Integer niQtyRefundForce;
 	 private Integer niCodeStatus;
 	 private Integer niStatusTicket;
 	 private Integer niStatusCheck;
 	 private Date tsTimeTicket;
 	 private Date tsTimeCheck;
 }