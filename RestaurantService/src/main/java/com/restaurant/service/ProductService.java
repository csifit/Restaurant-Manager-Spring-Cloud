package com.restaurant.service;

import com.restaurant.dto.Product;

import java.util.List;

/**
 * Created by Martha on 2/25/2017.
 */
public interface ProductService {

    Product createProduct(String productName);

    Product findProduct(int productId);

    Product updateProductName(int productId, String productName);

    boolean deleteProduct(int productId);

    List<Product> findAllProducts();

    List<Product> findAllProducts(List<Integer> ids);
}
