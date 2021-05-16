package com.marui.service.impl;

import com.marui.dao.IProductDao;
import com.marui.domain.Product;
import com.marui.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 产品业务层实现类
 * @author MaRui
 * @date 2021-05-14 17:28
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,readOnly = false)
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao productDao;

    /**
     * 查询所有产品信息
     */
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public List<Product> findAll() throws Exception {
        List<Product> list = productDao.findAll();
        System.out.println(list);
        return list;
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }
}
