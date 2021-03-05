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
 ota请求记录订单关联(ota_log_order)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="ota_log_order")
public class OtaLogOrderEntity {
	 /** 
	  * 请求Id
	  */
	 @TableId(value="nl_log_id",type= IdType.AUTO)
	 private Long nlLogId;

 	 /** 
	  * ota订单号
	  */
	 private String siOrdernoOta;

 	 /** 
	  * 系统订单号
	  */
	 private String siOrderno;

 }