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
@TableName(value="ops_mer_merchant")
public class OpsMerMerchantEntity {
	 @TableId(value="nl_merchant_id",type= IdType.AUTO)
	 private Long nlMerchantId;
 	 private Long nlCompanyId;
 	 private String siMerchantCode;
 	 private Integer niMerchantType;
 	 private String siContactName;
 	 private String siContactPhone;
 	 private String siMerchantKey;
 	 private Boolean isEnabled;
 	 private Boolean isDeleted;
 	 private String siRemark;
 	 private String siCreateUser;
 	 private Date tsCreateTime;
 	 private String siUpdateUser;
 	 private String siUpdateTime;
 }