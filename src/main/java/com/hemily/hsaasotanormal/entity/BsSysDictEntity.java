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
@TableName(value="bs_sys_dict")
public class BsSysDictEntity {
	 @TableId(value="nl_dict_key",type= IdType.AUTO)
	 private Long nlDictKey;
 	 private Long nlDictType;
 	 private String siDictCode;
 	 private String siDictValue;
 	 private Long nlParentKey;
 	 private Long nlParentCode;
 	 private String siDictIcon;
 	 private Integer niLimitSys;
 	 private Integer niDictSort;
 	 private String slRemark;
 	 private Boolean isDeleted;
 	 private String siCreateUser;
 	 private Date tsCreateTime;
 	 private String siUpdateUser;
 	 private String siUpdateTime;
 }