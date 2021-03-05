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
 退款记录明细表(order_refund_detail)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="order_refund_detail")
public class OrderRefundDetailEntity {
	 /** 
	  * 记录明细Id
	  */
	 @TableId(value="nl_detail_id",type= IdType.AUTO)
	 private Long nlDetailId;

 	 /** 
	  * 记录Id
	  */
	 private Long nlRefundId;

 	 /** 
	  * 退款订单号
	  */
	 private String siOrderno;

 	 /** 
	  * 凭证码
	  */
	 private String siEcode;

 	 /** 
	  * 产品Id
	  */
	 private Long nlProductId;

 	 /** 
	  * 退款单价
	  */
	 private Double niProductPrice;

 	 /** 
	  * 退款数量
	  */
	 private Integer niProductQty;

 	 /** 
	  * 退款金额
	  */
	 private Integer niProductAmt;

 }