package com.seckill.dao;


import com.seckill.bean.SeckillBean;

/**
 * Created by zhuhp on 2016/12/24.
 */



public interface SeckillDao {


//    /**
//     * 减库存
//     * @param seckillId
//     * @param killTime
//     * @return 如果返行为>1 ，表示更新成功
//     */
//    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);
//
    /**
     *
     * @param seckillId
     * @return
     */
    SeckillBean queryById(long seckillId);


//
//    /**
//     *根据偏移量查询秒杀商品列表
//     * @param offset
//     * @param limit
//     * @return
//     */
//    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);

}
