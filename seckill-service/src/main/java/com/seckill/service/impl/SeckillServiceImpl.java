package com.seckill.service.impl;

import com.seckill.api.SeckillService;
import com.seckill.dal.bean.SeckillBean;
import com.seckill.dal.dao.SeckillDao;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Service
public class SeckillServiceImpl implements SeckillService {

    private Logger logger = Logger.getLogger(SeckillServiceImpl.class);

    @Autowired
    private SeckillDao seckillDao;

    @Override
    public List<SeckillBean> search(Map<String, Object> map) {
        Map<String, Object> params = new HashMap<>();
        List<SeckillBean> list = seckillDao.search(params);
        System.out.println(list.size());
        logger.info("====invoke dao==>"+list.size());
        return list;
    }

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
