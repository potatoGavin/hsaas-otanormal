package com.hemily.hsaasotanormal.controller;

import com.hemily.hsaasotanormal.dto.APIResult;
import com.hemily.hsaasotanormal.dto.request.InBase;
import com.hemily.hsaasotanormal.dto.request.InProduct;
import com.sun.prism.impl.shape.NativePiscesRasterizer;
import org.springframework.web.bind.annotation.*;

/**
 * 业务逻辑接口
 * 请求参数都在请求体中
 */
@RestController
@RequestMapping("api")
public class BussinessController extends BaseController {


    /**
     * 获取门票信息
     *
     * @param inProduct 请求参数
     * @return
     */
    @PostMapping("product")
    public APIResult get_product(@RequestBody InProduct inProduct) {

        if (inProduct==null){
            return APIResult.waringParamError("无获取到请求参数");
        }
        System.out.println("come here woqu:"+inProduct.toString());





        return APIResult.success("获取产品成功");
    }

    @RequestMapping("get")
    public APIResult get() {
        return APIResult.success("test");
    }

}
