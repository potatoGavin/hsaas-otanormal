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
@TableName(value="ota_order_product")
public class OtaOrderProductEntity {
	 @TableId(value="nl_detail_id",type= IdType.AUTO)
	 private Long nlDetailId;
 	 private String siOrderno;
 	 private Long nlProductId;
 	 private Integer niProductCount;
 	 private Integer niPriceSettle;
 	 private Integer niPriceSell;
 	 private Date tsCreateTime;
 }