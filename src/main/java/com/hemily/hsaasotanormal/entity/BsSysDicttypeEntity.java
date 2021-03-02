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
@TableName(value="bs_sys_dicttype")
public class BsSysDicttypeEntity {
	 @TableId(value="nl_dict_type",type= IdType.AUTO)
	 private Long nlDictType;
 	 private String siTypeName;
 	 private String siTypeRemark;
 }