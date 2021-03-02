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
@TableName(value="ops_merchant_ota_meituan")
public class OpsMerchantOtaMeituanEntity {
	 @TableId(value="nl_merchant_id",type= IdType.AUTO)
	 private Long nlMerchantId;
 	 private Long nlOtaId;
 	 private Long nlMeituanId;
 	 private String siMeituanAccount;
 	 private String siMeituanKey;
 }