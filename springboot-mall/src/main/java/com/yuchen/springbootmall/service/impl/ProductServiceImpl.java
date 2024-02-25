package com.yuchen.springbootmall.service.impl;

import com.yuchen.springbootmall.dao.ProductDao;
import com.yuchen.springbootmall.model.Product;
import com.yuchen.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
