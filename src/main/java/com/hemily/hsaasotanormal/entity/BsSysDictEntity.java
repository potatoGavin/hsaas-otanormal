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
 数据字典(bs_sys_dict)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="bs_sys_dict")
public class BsSysDictEntity {
	 /** 
	  * 字典Key
	  */
	 @TableId(value="nl_dict_key",type= IdType.AUTO)
	 private Long nlDictKey;

 	 /** 
	  * 类型Id
	  */
	 private Long nlDictType;

 	 /** 
	  * 字典编码
	  */
	 private String siDictCode;

 	 /** 
	  * 字典值
	  */
	 private String siDictValue;

 	 /** 
	  * 上级字典Key
	  */
	 private Long nlParentKey;

 	 /** 
	  * 上级字典编码
	  */
	 private Long nlParentCode;

 	 /** 
	  * 字典图标
	  */
	 private String siDictIcon;

 	 /** 
	  * 系统限定
	  */
	 private Integer niLimitSys;

 	 /** 
	  * 排序号
	  */
	 private Integer niDictSort;

 	 /** 
	  * 备注
	  */
	 private String slRemark;

 	 /** 
	  * 是否删除
	  */
	 private Boolean isDeleted;

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