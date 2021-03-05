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
 凭证码同步表(order_ecode_sync)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="order_ecode_sync")
public class OrderEcodeSyncEntity {
	 /** 
	  * 凭证码
	  */
	 @TableId(value="si_ecode",type= IdType.AUTO)
	 private String siEcode;

 	 /** 
	  * 商户Id
	  */
	 private Long nlMerchantId;

 	 /** 
	  * 同步线下状态：0-未同步,1-已同步
	  */
	 private Integer niSyncOffline;

 	 /** 
	  * 同步ota状态：0-无需同步,1-未同步,2-已同步
	  */
	 private Integer niSyncOta;

 }