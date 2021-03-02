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
 商户OTA表(ops_merchant_ota)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="ops_merchant_ota")
public class OpsMerchantOtaEntity {
	 /** 
	  * 商户Id
	  */
	 @TableId(value="nl_merchant_id",type= IdType.AUTO)
	 private Long nlMerchantId;

 	 /** 
	  * ota账号
	  */
	 private String siOtaAccount;

 	 /** 
	  * ota回调地址
	  */
	 private String siOtaUrl;

 }