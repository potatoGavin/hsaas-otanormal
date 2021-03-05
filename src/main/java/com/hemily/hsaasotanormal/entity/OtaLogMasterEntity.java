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
 ota请求记录(ota_log_master)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="ota_log_master")
public class OtaLogMasterEntity {
	 /** 
	  * 请求Id
	  */
	 @TableId(value="nl_log_id",type= IdType.AUTO)
	 private Long nlLogId;

 	 /** 
	  * 商户Id
	  */
	 private Long nlMerchantId;

 	 /** 
	  * ota账号
	  */
	 private String siOtaAccount;

 	 /** 
	  * 请求时间戳
	  */
	 private String siReqTime;

 	 /** 
	  * 请求随机数
	  */
	 private String siReqNonce;

 	 /** 
	  * 请求接口
	  */
	 private String siReqMethod;

 	 /** 
	  * 响应结果：1-成功,2-验证失败,3-接口异常
	  */
	 private Integer niRspStatus;

 	 /** 
	  * 创建时间
	  */
	 private Date tsCreateTime;

 }