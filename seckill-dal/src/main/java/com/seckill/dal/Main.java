package com.seckill.dal;

import com.seckill.dal.bean.SeckillBean;
import com.seckill.dal.dao.SeckillDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{

        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
        SeckillDao seckillDao = ((SeckillDao) ctx.getBean("seckillDao"));

        // insert
//        SeckillBean bean = new SeckillBean();
//        bean.setSeckillId(1004);
//        bean.setName("1000元秒杀nova huawei");
//        seckillDao.updateById(bean);

        // query
        SeckillBean seckillBean = seckillDao.queryById(1003);
        System.out.println(seckillBean.getName());

        List<SeckillBean> search = seckillDao.search(new HashMap<>());
        System.out.println("======"+search.size());

    }
}
