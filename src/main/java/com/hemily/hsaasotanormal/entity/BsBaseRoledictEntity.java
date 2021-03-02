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
@TableName(value="bs_base_roledict")
public class BsBaseRoledictEntity {
	 @TableId(value="nl_dict_id",type= IdType.AUTO)
	 private Long nlDictId;
 	 private Integer niDictType;
 	 private Long nlMasterId;
 	 private Long nlItemId;
 }