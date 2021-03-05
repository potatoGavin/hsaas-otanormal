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
 价格日历表(ops_product_price_ota)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="ops_product_price_ota")
public class OpsProductPriceOtaEntity {
	 /** 
	  * 价格Id
	  */
	 @TableId(value="nl_price_id",type= IdType.AUTO)
	 private Long nlPriceId;

 	 /** 
	  * 所属景区Id
	  */
	 private Long nlMerchantId;

 	 /** 
	  * 所属渠道Id
	  */
	 private Long nlChannelId;

 	 /** 
	  * 产品Id
	  */
	 private Long nlProductId;

 	 /** 
	  * 售卖价
	  */
	 private Double niPriceSell;

 	 /** 
	  * 结算价
	  */
	 private Double niPriceSettle;

 	 /** 
	  * 有效日期
	  */
	 private Date tsDate;

 }