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
@TableName(value="ops_channel_finance_deal")
public class OpsChannelFinanceDealEntity {
	 @TableId(value="nl_occupation_id",type= IdType.AUTO)
	 private Long nlOccupationId;
 	 private Long nlMerchantId;
 	 private Long nlChannelId;
 	 private Integer niOccupationType;
 	 private Integer niAmount;
 	 private String siOrderno;
 	 private Integer niDealType;
 	 private Date tsCreateTime;
 	 private String siRemark;
 }