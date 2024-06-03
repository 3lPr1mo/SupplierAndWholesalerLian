package com.lian.supplierandwholesalerlian.domain.spi;

import com.lian.supplierandwholesalerlian.domain.model.Product;

import java.util.List;

public interface IProductPersistencePort {
    void saveProduct(Product product);

    List<Product> getAllProduct();

    Product getProduct(Long productId);

    void updateProduct(Product product);

    void deleteProduct(Long productId);
}
