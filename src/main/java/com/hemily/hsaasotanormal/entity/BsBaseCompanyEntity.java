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
 公司管理(bs_base_company)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="bs_base_company")
public class BsBaseCompanyEntity {
	 /** 
	  * 公司Id
	  */
	 @TableId(value="nl_company_id",type= IdType.AUTO)
	 private Long nlCompanyId;

 	 /** 
	  * 公司名称
	  */
	 private String siCompanyName;

 	 /** 
	  * 联系人
	  */
	 private String siContactsName;

 	 /** 
	  * 联系电话
	  */
	 private String siContactsPhone;

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

 	 /** 
	  * 是否删除
	  */
	 private Boolean isDeleted;

 }