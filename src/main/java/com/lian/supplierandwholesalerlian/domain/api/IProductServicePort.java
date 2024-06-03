package com.lian.supplierandwholesalerlian.domain.api;

import com.lian.supplierandwholesalerlian.domain.model.Product;

import java.util.List;

public interface IProductServicePort {
    void saveProduct(Product product);

    List<Product> getAllProduct();

    Product getProduct(Long productId);

    void updateProduct(Product product);

    void deleteProduct(Long productId);
}
