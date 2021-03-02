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
@TableName(value="order_recode_check")
public class OrderRecodeCheckEntity {
	 @TableId(value="nl_check_id",type= IdType.AUTO)
	 private Long nlCheckId;
 	 private Long nlMerchantId;
 	 private String siOrderno;
 	 private String siEcode;
 	 private Integer niQtyCheck;
 	 private Date tsCheckTime;
 	 private Integer niCheckTerminal;
 	 private Integer niCheckType;
 	 private Integer niRemark;
 }