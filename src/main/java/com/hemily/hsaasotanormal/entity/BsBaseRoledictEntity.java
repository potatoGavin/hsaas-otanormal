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
 权限字典表(bs_base_roledict)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="bs_base_roledict")
public class BsBaseRoledictEntity {
	 /** 
	  * 字典Id
	  */
	 @TableId(value="nl_dict_id",type= IdType.AUTO)
	 private Long nlDictId;

 	 /** 
	  * 类型：10-role_menu,11-role_button,12-role_company,13-role_merchant,20-user_menu,21-user_button,22-user_company,23-user_merchant
	  */
	 private Integer niDictType;

 	 /** 
	  * 主表Id
	  */
	 private Long nlMasterId;

 	 /** 
	  * 从表Id
	  */
	 private Long nlItemId;

 }