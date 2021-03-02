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
 用户信息表(bs_base_userinfo)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="bs_base_userinfo")
public class BsBaseUserinfoEntity {
	 /** 
	  * 用户Id
	  */
	 @TableId(value="nl_user_id",type= IdType.AUTO)
	 private Long nlUserId;

 	 /** 
	  * 所属公司
	  */
	 private Long nlCompanyId;

 	 /** 
	  * 登录账号
	  */
	 private String siUserAccount;

 	 /** 
	  * 登录密码
	  */
	 private String siUserPassword;

 	 /** 
	  * 用户姓名
	  */
	 private String siUserName;

 	 /** 
	  * 手机号
	  */
	 private String siUserMobile;

 	 /** 
	  * 当前权限模板
	  */
	 private Long nlRoleId;

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
	  * 是否启用
	  */
	 private Boolean isEnabled;

 	 /** 
	  * 是否删除
	  */
	 private Boolean isDeleted;

 }