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
@TableName(value="bs_sys_button")
public class BsSysButtonEntity {
	 @TableId(value="nl_button_id",type= IdType.AUTO)
	 private Long nlButtonId;
 	 private Long nlMenuId;
 	 private String siButtonName;
 	 private String siButtonEvent;
 	 private String siButtonIcon;
 	 private Integer niSort;
 	 private Boolean isEnabled;
 }