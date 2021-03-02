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
 权限模板表(bs_base_role)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="bs_base_role")
public class BsBaseRoleEntity {
	 /** 
	  * 模板Id
	  */
	 @TableId(value="nl_role_id",type= IdType.AUTO)
	 private Long nlRoleId;

 	 /** 
	  * 所属公司
	  */
	 private Long nlCompanyId;

 	 /** 
	  * 名称
	  */
	 private String siRoleName;

 	 /** 
	  * 备注
	  */
	 private String siRoleRemark;

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
	 private String siUpdateTime;

 	 /** 
	  * 是否启用
	  */
	 private Boolean isEnabled;

 }