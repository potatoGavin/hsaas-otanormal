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
 商户主表(ops_mer_merchant)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="ops_mer_merchant")
public class OpsMerMerchantEntity {
	 /** 
	  * 商户Id
	  */
	 @TableId(value="nl_merchant_id",type= IdType.AUTO)
	 private Long nlMerchantId;

 	 /** 
	  * 所属公司Id
	  */
	 private Long nlCompanyId;

 	 /** 
	  * 商户编码
	  */
	 private String siMerchantCode;

 	 /** 
	  * 商户类型：10-景区，21-ota，22-旅行社
	  */
	 private Integer niMerchantType;

 	 /** 
	  * 联系人
	  */
	 private String siContactName;

 	 /** 
	  * 联系电话
	  */
	 private String siContactPhone;

 	 /** 
	  * 秘钥
	  */
	 private String siMerchantKey;

 	 /** 
	  * 是否启用
	  */
	 private Boolean isEnabled;

 	 /** 
	  * 是否删除
	  */
	 private Boolean isDeleted;

 	 /** 
	  * 备注
	  */
	 private String siRemark;

 	 /** 
	  * 创建人
	  */
	 private String siCreateUser;

 	 /** 
	  * 创建时间
	  */
	 private Date tsCreateTime;

 	 /** 
	  * 更新人
	  */
	 private String siUpdateUser;

 	 /** 
	  * 更新时间
	  */
	 private String siUpdateTime;

 }