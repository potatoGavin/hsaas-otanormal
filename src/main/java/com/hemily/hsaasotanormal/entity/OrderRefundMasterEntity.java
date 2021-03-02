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
 退款记录主表(order_refund_master)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="order_refund_master")
public class OrderRefundMasterEntity {
	 /** 
	  * 记录Id
	  */
	 @TableId(value="nl_refund_id",type= IdType.AUTO)
	 private Long nlRefundId;

 	 /** 
	  * 退款订单号
	  */
	 private String siOrderno;

 	 /** 
	  * 退款原单号
	  */
	 private String siOrdernoOrigin;

 	 /** 
	  * 商户Id
	  */
	 private Long nlMerchantId;

 	 /** 
	  * 渠道Id
	  */
	 private Long nlChannelId;

 	 /** 
	  * 退款金额
	  */
	 private Integer niAmt;

 	 /** 
	  * 订单来源
	  */
	 private Integer niChannel;

 	 /** 
	  * 退款类型：0-普通退款,1-强制退款
	  */
	 private Integer niType;

 	 /** 
	  * 审核状态：0-待审核,1-审核通过，2-审核不通过
	  */
	 private Integer niStatus;

 	 /** 
	  * 申请时间
	  */
	 private Date tsReqTime;

 	 /** 
	  * 审核时间
	  */
	 private Date tsRspTime;

 	 /** 
	  * 申请人
	  */
	 private Integer niReqUser;

 	 /** 
	  * 申请备注
	  */
	 private Integer niReqRemark;

 	 /** 
	  * 审核人
	  */
	 private Integer niRspUser;

 	 /** 
	  * 审核备注
	  */
	 private Integer niRspRemark;

 }