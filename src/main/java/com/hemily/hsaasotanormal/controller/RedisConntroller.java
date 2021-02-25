package com.hemily.hsaasotanormal.controller;


import com.hemily.hsaasotanormal.utils.OrderUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 应用缓存服务
 */
@RestController
@RequestMapping("redis")
public class RedisConntroller {

    //加载合作协议
    //加载ota信息 table_otainfo
    //加载商户信息 table_parkinfo
    @RequestMapping("order")
    public String getOrderNo(String merchant){
        return OrderUtil.getOrderNo(merchant);
    }


}
