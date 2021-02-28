package com.hemily.hsaasotanormal.service.impl;

import com.hemily.hsaasotanormal.dao.OpsProductDao;
import com.hemily.hsaasotanormal.entity.OpsProductEntity;
import com.hemily.hsaasotanormal.service.OpsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpsProductServiceImpl implements OpsProductService {

    @Autowired
    OpsProductDao opsProductDao;

    public void getOpsProductList() {
        List<OpsProductEntity> users = opsProductDao.selectList(null);
        users.forEach(System.out::println);
    }
}
