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
 系统菜单表(bs_sys_menu)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="bs_sys_menu")
public class BsSysMenuEntity {
	 /** 
	  * 菜单Id
	  */
	 @TableId(value="nl_menu_id",type= IdType.AUTO)
	 private Long nlMenuId;

 	 /** 
	  * 所属模块:0-本身是模块
	  */
	 private Long nlParentId;

 	 /** 
	  * 菜单名称
	  */
	 private String siMenuName;

 	 /** 
	  * 地址名称
	  */
	 private String siMenuPath;

 	 /** 
	  * 地址路径
	  */
	 private String siMenuUrl;

 	 /** 
	  * 图标
	  */
	 private String siMenuIcon;

 	 /** 
	  * 排序号
	  */
	 private Integer niSort;

 	 /** 
	  * 是否启用
	  */
	 private Boolean isEnabled;

 }