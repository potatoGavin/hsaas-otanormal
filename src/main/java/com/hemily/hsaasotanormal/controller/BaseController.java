package com.hemily.hsaasotanormal.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

/**
 * 所有控制器基类
 */
@PropertySource({"classpath:appsettings.properties"})
public class BaseController {

    /**
     * 数据库集群，机器ID
     * 生成主键使用
     */
    @Value("${database.workerId}")
    public long workerId;

    /**
     * 数据库集群，数据中心ID
     * 生成主键使用
     */
    @Value("${database.datacenterId}")
    public long datacenterId;

}
