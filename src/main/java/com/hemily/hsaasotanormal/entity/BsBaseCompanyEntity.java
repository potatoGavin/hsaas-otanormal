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
@TableName(value="bs_base_company")
public class BsBaseCompanyEntity {
	 @TableId(value="nl_company_id",type= IdType.AUTO)
	 private Long nlCompanyId;
 	 private String siCompanyName;
 	 private String siContactsName;
 	 private String siContactsPhone;
 	 private String siRemark;
 	 private String siCreateUser;
 	 private Date tsCreateTime;
 	 private String siUpdateUser;
 	 private Date tsUpdateTime;
 	 private Boolean isDeleted;
 }