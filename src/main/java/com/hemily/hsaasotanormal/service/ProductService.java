package com.hemily.hsaasotanormal.service;

import com.hemily.hsaasotanormal.dto.ServiceResult;

import java.time.LocalDateTime;

/**
 * 产品相关接口
 */
public interface ProductService {

    /**
     * 获取产品信息
     *
     * @param parkId 景区商户Id
     * @param otaId ota商户Id
     * @param startTime 时间范围-生效时间
     * @param endTime 时间范围-失效时间
     * @param productId 如果传值就返回指定的产品，否则返回所有协议的产品
     * @return List<ProductInfo>
     */
    ServiceResult getlist_product(long parkId, long otaId, LocalDateTime startTime, LocalDateTime endTime, long productId);
}
