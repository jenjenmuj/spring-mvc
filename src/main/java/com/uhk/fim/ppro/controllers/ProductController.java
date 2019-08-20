package com.uhk.fim.ppro.controllers;

import com.uhk.fim.ppro.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// Controller nevi, jestli productlist je z databaze nebo z lokalni mapy
// jedine co dela je, ze bere list of products a pomoci Model je preposila dal
@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public String listProducts(Model model) {

        model.addAttribute("products", productService.listAllProducts());

        return "products";
    }
}
