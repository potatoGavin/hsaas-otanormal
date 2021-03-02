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
 基础产品库(ops_product)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="ops_product")
public class OpsProductEntity {
	 /** 
	  * 产品Id
	  */
	 @TableId(value="nl_product_id",type= IdType.AUTO)
	 private Long nlProductId;

 	 /** 
	  * 产品编码
	  */
	 private Integer niProductCode;

 	 /** 
	  * 所属商户Id
	  */
	 private Long nlMerchantId;

 	 /** 
	  * 产品名称
	  */
	 private String siProductName;

 	 /** 
	  * 线下编码
	  */
	 private String siOfflineCode;

 	 /** 
	  * 票面价
	  */
	 private Integer niPriceTicket;

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