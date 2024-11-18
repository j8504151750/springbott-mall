package com.lucas.springbootmall.dao.impl;

import com.lucas.springbootmall.dao.ProductDao;
import com.lucas.springbootmall.model.Product;
import com.lucas.springbootmall.rowmapper.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Product getProductById(Integer productid) {
        String sql = "SELECT product.product_id ,product_name, category, image_url,price, stock, description, " +
                "created_date, last_modified_date From product " +
                "WHERE product_id = :product_id ";
        Map<String, Object> map = new HashMap<>();
        map.put("product_id", productid);

        List<Product> productList = namedParameterJdbcTemplate.query(sql, map, new ProductRowMapper());

        if (productList.size() > 0){
            return productList.get(0);
        }else{
            return null;
        }

    };

}
