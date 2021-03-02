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
@TableName(value="ops_channel_protocol")
public class OpsChannelProtocolEntity {
	 @TableId(value="nl_protocol_id",type= IdType.AUTO)
	 private Long nlProtocolId;
 	 private Long nlMerchantId;
 	 private Long nlChannelId;
 	 private String siMerchantContactName;
 	 private String siMerchantContactPhone;
 	 private String siChannelContactName;
 	 private String siChannelContactPhone;
 	 private Date tsEffectiveSt;
 	 private Date tsEffectiveEt;
 	 private Boolean isEnabled;
 	 private Boolean isDeleted;
 	 private String siRemark;
 	 private String siCreateUser;
 	 private Date tsCreateTime;
 	 private String siUpdateUser;
 	 private String siUpdateTime;
 }