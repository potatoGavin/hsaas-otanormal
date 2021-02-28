package com.hemily.hsaasotanormal.controller;

import com.hemily.hsaasotanormal.service.OpsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试业务逻辑的接口
 * 请求参数会在代码中直接模拟，用于amy测试开发使用，测试完毕，该文件会删掉
 *
 */
@RestController
@RequestMapping("api")
public class TestController {

    @Autowired
    private OpsProductService opsProductService;

    @GetMapping("/ops_product_test")
    public void getOpsProductController(){
        //测试这个接口时，需要屏蔽InterceptorConfig文件的addInterceptors第一行
        System.out.println("hello opsProduct");
        opsProductService.getOpsProductList();
    }
}
