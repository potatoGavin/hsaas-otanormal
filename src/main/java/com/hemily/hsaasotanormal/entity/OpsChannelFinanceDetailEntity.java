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
 渠道订单消费明细(ops_channel_finance_detail)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="ops_channel_finance_detail")
public class OpsChannelFinanceDetailEntity {
	 /** 
	  * 明细Id
	  */
	 @TableId(value="nl_occupation_detail",type= IdType.AUTO)
	 private Long nlOccupationDetail;

 	 /** 
	  * 商户Id
	  */
	 private Long nlMerchantId;

 	 /** 
	  * 渠道Id
	  */
	 private Long nlChannelId;

 	 /** 
	  * 消费Id
	  */
	 private Long nlOccupationId;

 	 /** 
	  * 订单号
	  */
	 private String siOrderno;

 	 /** 
	  * 电子票号
	  */
	 private String siEcode;

 	 /** 
	  * 产品Id
	  */
	 private Long nlProduct;

 	 /** 
	  * 产品单价
	  */
	 private Double niPrice;

 	 /** 
	  * 产品数量
	  */
	 private Integer niCount;

 	 /** 
	  * 消费金额
	  */
	 private Integer niAmount;

 	 /** 
	  * 消费时间
	  */
	 private Date tsCreateTime;

 	 /** 
	  * 备注
	  */
	 private String siRemark;

 }