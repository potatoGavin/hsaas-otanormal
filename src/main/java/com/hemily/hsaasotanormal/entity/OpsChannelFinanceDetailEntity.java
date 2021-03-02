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
@TableName(value="ops_channel_finance_detail")
public class OpsChannelFinanceDetailEntity {
	 @TableId(value="nl_occupation_detail",type= IdType.AUTO)
	 private Long nlOccupationDetail;
 	 private Long nlMerchantId;
 	 private Long nlChannelId;
 	 private Long nlOccupationId;
 	 private String siOrderno;
 	 private String siEcode;
 	 private Long nlProduct;
 	 private Integer niPrice;
 	 private Integer niCount;
 	 private Integer niAmount;
 	 private Date tsCreateTime;
 	 private String siRemark;
 }