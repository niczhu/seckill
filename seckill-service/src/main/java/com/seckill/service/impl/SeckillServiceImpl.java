package com.seckill.service.impl;

import com.seckill.api.SeckillService;
import com.seckill.bean.SeckillBean;
import org.apache.dubbo.config.annotation.Service;

public class SeckillServiceImpl implements SeckillService {

    @Override
    public SeckillBean queryById() {
        SeckillBean seckill = new SeckillBean();
        seckill.setName("test-1");
        seckill.setSeckillId(1);
        seckill.setNumber(100);
        return seckill;
    }

    @Override
    public String test() {
        return "test hart beat..";
    }

}
