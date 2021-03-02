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
@TableName(value="bs_sys_menu")
public class BsSysMenuEntity {
	 @TableId(value="nl_menu_id",type= IdType.AUTO)
	 private Long nlMenuId;
 	 private Long nlParentId;
 	 private String siMenuName;
 	 private String siMenuPath;
 	 private String siMenuUrl;
 	 private String siMenuIcon;
 	 private Integer niSort;
 	 private Boolean isEnabled;
 }