package com.seckill.api;

import com.seckill.dal.bean.SeckillBean;

import java.util.List;
import java.util.Map;

public interface SeckillService {

    public List<SeckillBean> search(Map<String,Object> map);

    public SeckillBean queryById(long seckillId);

    public String test();

}
