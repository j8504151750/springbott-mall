package com.lucas.springbootmall.dao;

import com.lucas.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productid);

}
