package com.seckill.service.impl;

import com.seckill.api.SeckillService;
import com.seckill.dal.bean.SeckillBean;
import com.seckill.dal.dao.SeckillDao;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

//@Service
public class SeckillServiceImpl implements SeckillService {

    private Logger logger = Logger.getLogger(SeckillServiceImpl.class);

    @Autowired
    private SeckillDao seckillDao;

    @Override
    public List<SeckillBean> search(Map<String, Object> params) {
        try{
            List<SeckillBean> list = seckillDao.search(params);
            logger.info("search seckill size==>"+list.size());
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public SeckillBean queryById(long seckillId) {
        try{
            return seckillDao.queryById(seckillId);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String test() {
        return "dubbo test hart beat..";
    }

}
