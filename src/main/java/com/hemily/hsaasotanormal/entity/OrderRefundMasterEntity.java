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
@TableName(value="order_refund_master")
public class OrderRefundMasterEntity {
	 @TableId(value="nl_refund_id",type= IdType.AUTO)
	 private Long nlRefundId;
 	 private String siOrderno;
 	 private String siOrdernoOrigin;
 	 private Long nlMerchantId;
 	 private Long nlChannelId;
 	 private Integer niAmt;
 	 private Integer niChannel;
 	 private Integer niType;
 	 private Integer niStatus;
 	 private Date tsReqTime;
 	 private Date tsRspTime;
 	 private Integer niReqUser;
 	 private Integer niReqRemark;
 	 private Integer niRspUser;
 	 private Integer niRspRemark;
 }