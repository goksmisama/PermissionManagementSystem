package com.marui.service;

import com.marui.domain.Orders;

import java.util.List;

/**
 * @author MaRui
 * @date 2021-05-16 22:53
 */
public interface IOrdersService {

    List<Orders> findAll() throws Exception;

    List<Orders> findAllByPage(int pageNum,int pageSize) throws Exception;

    void saveOrders(Orders orders);

    Orders findById(String id) throws Exception;
}
