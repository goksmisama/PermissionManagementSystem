package com.marui.service;

import com.marui.domain.Product;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 产品业务层接口
 * @author MaRui
 * @date 2021-05-14 17:26
 */
public interface IProductService {

    List<Product> findAll() throws Exception;

    List<Product> findAllByPage(int pageNum, int pageSize) throws Exception;

    void saveProduct(Product product);
}
