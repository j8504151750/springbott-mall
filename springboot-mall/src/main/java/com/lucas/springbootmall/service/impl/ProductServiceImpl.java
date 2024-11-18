package com.lucas.springbootmall.service.impl;

import com.lucas.springbootmall.dao.ProductDao;
import com.lucas.springbootmall.model.Product;
import com.lucas.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao ;

    @Override
    public Product getProductById(Integer productid) {
        return  productDao.getProductById(productid);
    }
}
