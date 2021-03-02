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
@TableName(value="order_refund_detail")
public class OrderRefundDetailEntity {
	 @TableId(value="nl_detail_id",type= IdType.AUTO)
	 private Long nlDetailId;
 	 private Long nlRefundId;
 	 private String siOrderno;
 	 private String siEcode;
 	 private Long nlProductId;
 	 private Integer niProductPrice;
 	 private Integer niProductQty;
 	 private Integer niProductAmt;
 }