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
 商户非标OTA,美团(ops_merchant_ota_meituan)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="ops_merchant_ota_meituan")
public class OpsMerchantOtaMeituanEntity {
	 /** 
	  * 景区Id
	  */
	 @TableId(value="nl_merchant_id",type= IdType.AUTO)
	 private Long nlMerchantId;

 	 /** 
	  * otaId
	  */
	 private Long nlOtaId;

 	 /** 
	  * 美团Id
	  */
	 private Long nlMeituanId;

 	 /** 
	  * 美团账号
	  */
	 private String siMeituanAccount;

 	 /** 
	  * 美团秘钥
	  */
	 private String siMeituanKey;

 }