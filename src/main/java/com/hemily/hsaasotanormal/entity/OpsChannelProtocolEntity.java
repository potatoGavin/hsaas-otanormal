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
 渠道合作协议表(ops_channel_protocol)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="ops_channel_protocol")
public class OpsChannelProtocolEntity {
	 /** 
	  * 协议Id
	  */
	 @TableId(value="nl_protocol_id",type= IdType.AUTO)
	 private Long nlProtocolId;

 	 /** 
	  * 商户Id
	  */
	 private Long nlMerchantId;

 	 /** 
	  * 渠道Id
	  */
	 private Long nlChannelId;

 	 /** 
	  * 景区联系人
	  */
	 private String siMerchantContactName;

 	 /** 
	  * 景区联系电话
	  */
	 private String siMerchantContactPhone;

 	 /** 
	  * 渠道联系人
	  */
	 private String siChannelContactName;

 	 /** 
	  * 渠道联系电话
	  */
	 private String siChannelContactPhone;

 	 /** 
	  * 生效时间
	  */
	 private Date tsEffectiveSt;

 	 /** 
	  * 失效时间
	  */
	 private Date tsEffectiveEt;

 	 /** 
	  * 是否启用
	  */
	 private Boolean isEnabled;

 	 /** 
	  * 是否删除
	  */
	 private Boolean isDeleted;

 	 /** 
	  * 备注
	  */
	 private String siRemark;

 	 /** 
	  * 创建人
	  */
	 private String siCreateUser;

 	 /** 
	  * 创建时间
	  */
	 private Date tsCreateTime;

 	 /** 
	  * 更新人
	  */
	 private String siUpdateUser;

 	 /** 
	  * 更新时间
	  */
	 private Date tsUpdateTime;

 }