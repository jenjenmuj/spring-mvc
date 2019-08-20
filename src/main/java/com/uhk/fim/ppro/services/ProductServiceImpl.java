package com.uhk.fim.ppro.services;

import com.uhk.fim.ppro.domain.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService{
    private Map<Integer, Product> products;

    public ProductServiceImpl() {
        loadProducts();
    }

    @Override
    public List<Product> listAllProducts() {
        return new ArrayList<>(products.values());
    }

    private void loadProducts() {
        products = new HashMap<>();

        Product product1 = new Product();
        product1.setId(1);
        product1.setDescription("Product 1");
        product1.setPrice(new BigDecimal("12.99"));
        product1.setImageUrl("http://example.com/product1");

        products.put(1, product1);

        Product product2 = new Product();
        product1.setId(2);
        product1.setDescription("Product 2");
        product1.setPrice(new BigDecimal("32.99"));
        product1.setImageUrl("http://example.com/product2");

        products.put(2, product2);

        Product product3 = new Product();
        product1.setId(3);
        product1.setDescription("Product 3");
        product1.setPrice(new BigDecimal("15.99"));
        product1.setImageUrl("http://example.com/product3");

        products.put(3, product3);

        Product product4 = new Product();
        product1.setId(4);
        product1.setDescription("Product 4");
        product1.setPrice(new BigDecimal("44.99"));
        product1.setImageUrl("http://example.com/product4");

        products.put(4, product4);

        Product product5 = new Product();
        product1.setId(5);
        product1.setDescription("Product 5");
        product1.setPrice(new BigDecimal("882.99"));
        product1.setImageUrl("http://example.com/product5");

        products.put(5, product5);


    }
}
