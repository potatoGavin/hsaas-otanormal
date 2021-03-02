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
@TableName(value="order_recode_ecode")
public class OrderRecodeEcodeEntity {
	 @TableId(value="nl_detail_id",type= IdType.AUTO)
	 private Long nlDetailId;
 	 private Long nlRecodeId;
 	 private String siOrderno;
 	 private String siEcode;
 	 private Long nlProductId;
 	 private Integer niRecodeType;
 	 private Date tsCreateTime;
 	 private Integer niCreateUser;
 	 private Integer niRemark;
 }