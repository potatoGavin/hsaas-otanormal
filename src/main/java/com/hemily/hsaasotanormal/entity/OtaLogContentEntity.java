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
 ota请求记录内容(ota_log_content)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="ota_log_content")
public class OtaLogContentEntity {
	 /** 
	  * 请求Id
	  */
	 @TableId(value="nl_log_id",type= IdType.AUTO)
	 private Long nlLogId;

 	 /** 
	  * 请求内容
	  */
	 private String slReqContent;

 	 /** 
	  * 响应内容
	  */
	 private String slRspContent;

 	 /** 
	  * 接口内部日志内容
	  */
	 private String slLog;

 }