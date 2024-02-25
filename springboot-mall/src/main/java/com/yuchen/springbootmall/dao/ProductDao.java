package com.yuchen.springbootmall.dao;

import com.yuchen.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
