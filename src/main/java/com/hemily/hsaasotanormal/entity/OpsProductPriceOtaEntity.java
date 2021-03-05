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
@TableName(value="ops_product_price_ota")
public class OpsProductPriceOtaEntity {
    @TableId(value="nl_price_id",type= IdType.AUTO)
    private Long nlProductId;
    private Long nlMerchantId;
    private String siProductName;
    private String siOfflineCode;
    private Integer niPriceTicket;
    private Boolean isEnabled;
    private Boolean isDeleted;
    private Date tsCreateTime;
}
