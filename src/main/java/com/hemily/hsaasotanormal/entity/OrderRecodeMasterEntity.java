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
@TableName(value="order_recode_master")
public class OrderRecodeMasterEntity {
	 @TableId(value="nl_recode_id",type= IdType.AUTO)
	 private Long nlRecodeId;
 	 private String siOrderno;
 	 private Long nlMerchantId;
 	 private Long nlChannelId;
 	 private Integer niRecodeType;
 	 private Date tsCreateTime;
 	 private Integer niCreateUser;
 	 private Integer niRemark;
 }