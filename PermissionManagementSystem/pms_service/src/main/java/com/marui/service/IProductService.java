package com.marui.service;

import com.marui.domain.Product;

import java.util.List;

/**
 * 产品业务层接口
 * @author MaRui
 * @date 2021-05-14 17:26
 */
public interface IProductService {
    /**
     * 查询所有产品信息
     */
    List<Product> findAll() throws Exception;

    void save(Product product);
}
