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
 系统操作按钮表(bs_sys_button)Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value="bs_sys_button")
public class BsSysButtonEntity {
	 /** 
	  * 按钮Id
	  */
	 @TableId(value="nl_button_id",type= IdType.AUTO)
	 private Long nlButtonId;

 	 /** 
	  * 所属菜单
	  */
	 private Long nlMenuId;

 	 /** 
	  * 按钮名称
	  */
	 private String siButtonName;

 	 /** 
	  * 绑定事件
	  */
	 private String siButtonEvent;

 	 /** 
	  * 图标
	  */
	 private String siButtonIcon;

 	 /** 
	  * 排序号
	  */
	 private Integer niSort;

 	 /** 
	  * 是否启用
	  */
	 private Boolean isEnabled;

 }