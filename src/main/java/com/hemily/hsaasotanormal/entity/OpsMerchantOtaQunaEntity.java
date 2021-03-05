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
 商户非标OTA,去哪儿(ops_merchant_ota_quna)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="ops_merchant_ota_quna")
public class OpsMerchantOtaQunaEntity {
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
	  * 去哪儿账户
	  */
	 private String siQunaAccount;

 	 /** 
	  * 去哪儿秘钥
	  */
	 private String siQunaKey;

 }