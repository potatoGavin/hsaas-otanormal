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
@TableName(value="ops_product_sell")
public class OpsProductSellEntity {
	 @TableId(value="nl_product_id",type= IdType.AUTO)
	 private Long nlProductId;
 	 private Integer niProductCode;
 	 private Long nlMerchantId;
 	 private String siProductName;
 	 private String siOfflineCode;
 	 private Integer niPriceTicket;
 	 private Integer niPriceSell;
 	 private Date tsEffectiveSt;
 	 private Date tsEffectiveEt;
 	 private Boolean isDeleted;
 	 private String siRemark;
 	 private String siCreateUser;
 	 private Date tsCreateTime;
 	 private String siUpdateUser;
 	 private String siUpdateTime;
 }