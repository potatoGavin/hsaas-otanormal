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
@TableName(value="bs_base_role")
public class BsBaseRoleEntity {
	 @TableId(value="nl_role_id",type= IdType.AUTO)
	 private Long nlRoleId;
 	 private Long nlCompanyId;
 	 private String siRoleName;
 	 private String siRoleRemark;
 	 private String siCreateUser;
 	 private Date tsCreateTime;
 	 private String siUpdateUser;
 	 private String siUpdateTime;
 	 private Boolean isEnabled;
 }