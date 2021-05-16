package com.marui.service.impl;

import com.github.pagehelper.PageHelper;
import com.marui.dao.IOrdersDao;
import com.marui.domain.Orders;
import com.marui.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author MaRui
 * @date 2021-05-16 22:58
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,readOnly = false)
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Orders> findAll() throws Exception {
        return ordersDao.findAll();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Orders> findAllByPage(int pageNum, int pageSize) throws Exception {
        PageHelper.startPage(pageNum, pageSize);
        return ordersDao.findAll();
    }

    @Override
    public void saveOrders(Orders orders) {
        ordersDao.saveOrders(orders);
    }
}
