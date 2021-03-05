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
 ota产品清单(ota_order_product)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="ota_order_product")
public class OtaOrderProductEntity {
	 /** 
	  * 清单Id
	  */
	 @TableId(value="nl_detail_id",type= IdType.AUTO)
	 private Long nlDetailId;

 	 /** 
	  * 订单号
	  */
	 private String siOrderno;

 	 /** 
	  * 产品Id
	  */
	 private Long nlProductId;

 	 /** 
	  * 购买数量
	  */
	 private Integer niProductCount;

 	 /** 
	  * 单价(结算价)
	  */
	 private Double niPriceSettle;

 	 /** 
	  * 单价((结算价)
	  */
	 private Double niPriceSell;

 	 /** 
	  * 创建时间
	  */
	 private Date tsCreateTime;

 }