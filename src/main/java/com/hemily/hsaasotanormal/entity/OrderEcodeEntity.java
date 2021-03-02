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
@TableName(value="order_ecode")
public class OrderEcodeEntity {
	 @TableId(value="si_ecode",type= IdType.AUTO)
	 private String siEcode;
 	 private String siOrderno;
 	 private Long nlMerchantId;
 	 private Long nlCustomerId;
 	 private Integer niQtyOrder;
 	 private Long nlProductId;
 	 private Integer niChannel;
 	 private String siOfflineCode;
 	 private Date tsCreateTime;
 	 private Date tsEffectiveSt;
 	 private Date tsEffectiveEt;
 }