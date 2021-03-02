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
@TableName(value="bs_base_userinfo")
public class BsBaseUserinfoEntity {
	 @TableId(value="nl_user_id",type= IdType.AUTO)
	 private Long nlUserId;
 	 private Long nlCompanyId;
 	 private String siUserAccount;
 	 private String siUserPassword;
 	 private String siUserName;
 	 private String siUserMobile;
 	 private Long nlRoleId;
 	 private String siCreateUser;
 	 private Date tsCreateTime;
 	 private String siUpdateUser;
 	 private Date tsUpdateTime;
 	 private Boolean isEnabled;
 	 private Boolean isDeleted;
 }