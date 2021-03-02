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
 渠道订单消费统计(ops_channel_finance_deal)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="ops_channel_finance_deal")
public class OpsChannelFinanceDealEntity {
	 /** 
	  * 消费Id
	  */
	 @TableId(value="nl_occupation_id",type= IdType.AUTO)
	 private Long nlOccupationId;

 	 /** 
	  * 商户Id
	  */
	 private Long nlMerchantId;

 	 /** 
	  * 渠道Id
	  */
	 private Long nlChannelId;

 	 /** 
	  * 订单类型：21-ota,22-旅行社
	  */
	 private Integer niOccupationType;

 	 /** 
	  * 消费金额
	  */
	 private Integer niAmount;

 	 /** 
	  * 订单号
	  */
	 private String siOrderno;

 	 /** 
	  * 消费类型：1-占用，2-支付,3-释放,4-退款
	  */
	 private Integer niDealType;

 	 /** 
	  * 消费时间
	  */
	 private Date tsCreateTime;

 	 /** 
	  * 备注
	  */
	 private String siRemark;

 }