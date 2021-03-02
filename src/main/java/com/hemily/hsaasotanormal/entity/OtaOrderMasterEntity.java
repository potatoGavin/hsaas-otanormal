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
@TableName(value="ota_order_master")
public class OtaOrderMasterEntity {
	 @TableId(value="si_orderno",type= IdType.AUTO)
	 private String siOrderno;
 	 private String siOrdernoOta;
 	 private Long nlMerchantId;
 	 private Long nlChannelId;
 	 private Date tsPlay;
 	 private Integer niStatus;
 	 private Integer niAmtSettle;
 	 private Integer niAmtSell;
 	 private Date tsCreateTime;
 }