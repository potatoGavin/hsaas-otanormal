package com.hemily.hsaasotanormal.mapper;

import com.hemily.hsaasotanormal.dto.product.ProductCyclePrice;
import com.hemily.hsaasotanormal.dto.product.ProductRsp;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 获取产品相关Mapper
 * todo://未实现sql方法
 */
@Repository
public class ProductMapper {

    /**
     * 获取产品信息
     *
     * @param parkId    景区商户Id
     * @param otaId     ota商户Id
     * @param startTime 时间范围-生效时间
     * @param endTime   时间范围-失效时间
     * @param productId 如果传值就返回指定的产品，否则返回所有协议的产品
     * @return
     */
    public List<ProductRsp> getlist_product(long parkId, long otaId, String startTime, String endTime, long productId) {
        return null;
    }


    /**
     * 获取产品的周期价
     *
     * @param parkId    景区商户Id
     * @param otaId     ota商户Id
     * @param startTime 时间范围-生效时间
     * @param endTime   时间范围-失效时间
     * @param productId 如果传值就返回指定的产品，否则返回所有协议的产品
     * @return
     */
    public List<ProductCyclePrice> getlist_price(long parkId, long otaId, String startTime, String endTime, long productId) {
        return null;
    }

}
