package com.seckill.dal.dao;

import com.seckill.dal.bean.SeckillBean;

import java.util.List;
import java.util.Map;

/**
 * Created by zhuhp on 2016/12/24.
 */
public interface SeckillDao {

    /**
     *
     * @param seckillId
     * @return
     */
    SeckillBean queryById(long seckillId);

    /**
     * query all
     *
     * @param params
     * @return
     */
    List<SeckillBean> search(Map<String,Object> params);

    /**
     *  update
     * @param seckillBean
     * @return
     */
    long updateById(SeckillBean seckillBean);

}
