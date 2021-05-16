package com.marui.dao;

import com.marui.domain.Orders;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author MaRui
 * @date 2021-05-16 23:03
 */
@Repository
public interface IOrdersDao {
    @Select("select * from orders")
    @Results({
            @Result(id=true,property="id",column="id"),
            @Result(property="orderNum",column="orderNum"),
            @Result(property="orderTime",column="orderTime"),
            @Result(property="orderStatus",column="orderStatus"),
            @Result(property="peopleCount",column="peopleCount"),
            @Result(property="payType",column="payType"),
            @Result(property="orderDesc",column="orderDesc"),
            @Result(property="product",column="productId",one=@One(select="com.marui.dao.IProductDao.findById",fetchType= FetchType.EAGER))
    })
    List<Orders> findAll();

    @Insert("insert into orders(orderNum,orderTime,peopleCount,orderDesc,payType,orderStatus,productId,MemberId) "
            + "values(#{orderNum},#{orderTime},#{peopleCount},#{orderDesc},#{payType},#{orderStatus},#{productId},#{MemberId})")
    void saveOrders(Orders orders);
}
