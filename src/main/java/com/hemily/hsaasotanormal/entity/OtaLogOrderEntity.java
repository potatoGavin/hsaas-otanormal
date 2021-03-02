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
@TableName(value="ota_log_order")
public class OtaLogOrderEntity {
	 @TableId(value="nl_log_id",type= IdType.AUTO)
	 private Long nlLogId;
 	 private String siOrdernoOta;
 	 private String siOrderno;
 }