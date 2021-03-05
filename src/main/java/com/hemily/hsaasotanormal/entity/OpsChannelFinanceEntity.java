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
 渠道财务协议表(ops_channel_finance)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="ops_channel_finance")
public class OpsChannelFinanceEntity {
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
	  * 账户余额
	  */
	 private Integer niAmountBalance;

 	 /** 
	  * 信用额度
	  */
	 private Integer niAmountCreditline;

 	 /** 
	  * 占用金额
	  */
	 private Integer niAmountOccupation;

 	 /** 
	  * 账户状态：0-禁用，1-正常
	  */
	 private Integer niStatus;

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