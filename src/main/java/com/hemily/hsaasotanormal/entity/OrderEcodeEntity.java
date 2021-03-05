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
 凭证码表(order_ecode)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="order_ecode")
public class OrderEcodeEntity {
	 /** 
	  * 凭证码
	  */
	 @TableId(value="si_ecode",type= IdType.AUTO)
	 private String siEcode;

 	 /** 
	  * 订单号
	  */
	 private String siOrderno;

 	 /** 
	  * 商户Id
	  */
	 private Long nlMerchantId;

 	 /** 
	  * 订单游客Id
	  */
	 private Long nlCustomerId;

 	 /** 
	  * 购买数量
	  */
	 private Integer niQtyOrder;

 	 /** 
	  * 产品id
	  */
	 private Long nlProductId;

 	 /** 
	  * 订单来源
	  */
	 private Integer niChannel;

 	 /** 
	  * 线下编码
	  */
	 private String siOfflineCode;

 	 /** 
	  * 创建时间
	  */
	 private Date tsCreateTime;

 	 /** 
	  * 生效时间
	  */
	 private Date tsEffectiveSt;

 	 /** 
	  * 失效时间
	  */
	 private Date tsEffectiveEt;

 }