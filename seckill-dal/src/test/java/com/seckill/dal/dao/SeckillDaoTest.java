package com.seckill.dal.dao;

import com.seckill.dal.bean.SeckillBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:seckill-dal-config.xml"})
public class SeckillDaoTest {

    @Autowired
    private SeckillDao seckillDao;

    @Test
    public void queryById(){
        SeckillBean seckillBean = seckillDao.queryById(1004);
        System.out.println(seckillBean.getName()+"=====<<");

    }
}
