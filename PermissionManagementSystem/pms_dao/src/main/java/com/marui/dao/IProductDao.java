package com.marui.dao;

import com.marui.domain.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * 产品持久层接口
 * @author MaRui
 * @date 2021-05-14 17:22
 */
@Repository
public interface IProductDao {
    /**
     * 查询所有产品信息
     */
    @Select("select * from product")
    List<Product> findAll() throws Exception;
}
