package com.hemily.hsaasotanormal.service.impl;

import com.hemily.hsaasotanormal.dto.ServiceResult;
import com.hemily.hsaasotanormal.dto.product.ProductCyclePrice;
import com.hemily.hsaasotanormal.dto.product.ProductRsp;
import com.hemily.hsaasotanormal.mapper.ProductMapper;
import com.hemily.hsaasotanormal.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    /**
     * 产品DI映射
     */
    @Autowired
    private ProductMapper productMapper;

    /**
     * 获取产品信息
     *
     * @param parkId    景区商户Id
     * @param otaId     ota商户Id
     * @param startTime 时间范围-生效时间
     * @param endTime   时间范围-失效时间
     * @param productId 如果传值就返回指定的产品，否则返回所有协议的产品
     * @return List<ProductInfo>
     */
    @Override
    public ServiceResult getlist_product(long parkId, long otaId, LocalDateTime startTime, LocalDateTime endTime, long productId) {

        try {
            List<ProductRsp> result = new ArrayList<>();
            List<ProductCyclePrice> pricelist = new ArrayList<>();

            String st = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(startTime);
            String et = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(endTime);

            result = productMapper.getlist_product(parkId, otaId, st, et, productId);
            if (result == null || result.size() <= 0) {
                return ServiceResult.success("获取到的数据为空");
            }
            pricelist = productMapper.getlist_price(parkId, otaId, st, et, productId);
            pricelist = pricelist == null ? new ArrayList<ProductCyclePrice>() : pricelist;

            for (ProductRsp master :
                    result) {
                master.calendarDates = revert_price(master, startTime, endTime, pricelist);
            }

            return ServiceResult.success("获取成功", result);
        } catch (Exception ex) {
            return ServiceResult.fail("获取失败", "接口内部发生异常" + ex.getMessage());
        }
    }

    /**
     * 重组产品周期价
     *
     * @param product   产品信息
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @param datalist  周期价
     * @return
     */
    private List<ProductCyclePrice> revert_price(ProductRsp product, LocalDateTime startTime, LocalDateTime endTime, List<ProductCyclePrice> datalist) {

        List<ProductCyclePrice> result = new ArrayList<>();
        boolean flag = true;
        long days = Duration.between(startTime, endTime).toDays();
        if (product.ckPriceType == 0 || datalist == null || datalist.size() <= 0) {
            flag = false;
        }

        // 读取属于这个产品的价格日历
        List<ProductCyclePrice> datas = datalist.stream().filter(price -> Objects.equals(price.getProductId(), product.productId)).collect(Collectors.toList());

        if (datas == null || datas.size() <= 0) {
            flag = false;
        }


        if (flag) {
            for (int i = 0; i < days; i++) {
                ProductCyclePrice price = new ProductCyclePrice();
                price.productId = product.productId;
                price.priceSell = product.priceSell;
                price.priceSettle = product.priceSettle;
                price.calendarDate = startTime.plusDays(i);
                result.add(price);
            }

            return result;
        }

        for (int i = 0; i < days; i++) {
            LocalDateTime itemdate = startTime.plusDays(i);
            String dtCheck = itemdate.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
            List<ProductCyclePrice> itemPrice = datas.stream().filter(price ->
                    Objects.equals(price.getCalendarDate().format(DateTimeFormatter.ofPattern("yyyyMMdd")), dtCheck)).
                    collect(Collectors.toList());

            ProductCyclePrice price = new ProductCyclePrice();
            price.productId = product.productId;
            price.calendarDate = startTime.plusDays(i);

            if (itemPrice != null && itemPrice.size() > 0) {
                price.priceSell = itemPrice.get(0).priceSell;
                price.priceSettle = itemPrice.get(0).priceSettle;
            } else {
                price.priceSell = product.priceSell;
                price.priceSettle = product.priceSettle;
            }

            result.add(price);
        }


        return result;
    }
}
