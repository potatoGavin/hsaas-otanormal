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
 数据字典类型(bs_sys_dicttype)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="bs_sys_dicttype")
public class BsSysDicttypeEntity {
	 /** 
	  * 类型Id
	  */
	 @TableId(value="nl_dict_type",type= IdType.AUTO)
	 private Long nlDictType;

 	 /** 
	  * 类型名称
	  */
	 private String siTypeName;

 	 /** 
	  * 备注
	  */
	 private String siTypeRemark;

 }