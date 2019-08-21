package com.uhk.fim.ppro.services;

import com.uhk.fim.ppro.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAllProducts();
    Product getProductById(Integer id);
    Product saveOrUpdateProduct(Product product);
}
