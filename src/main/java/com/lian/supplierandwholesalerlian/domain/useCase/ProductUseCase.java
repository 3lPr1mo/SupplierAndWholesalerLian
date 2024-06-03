package com.lian.supplierandwholesalerlian.domain.useCase;

import com.lian.supplierandwholesalerlian.domain.api.IProductServicePort;
import com.lian.supplierandwholesalerlian.domain.model.Product;
import com.lian.supplierandwholesalerlian.domain.spi.IProductPersistencePort;

import java.util.List;

public class ProductUseCase implements IProductServicePort {

    private final IProductPersistencePort productPersistencePort;

    public ProductUseCase(IProductPersistencePort productPersistencePort) {
        this.productPersistencePort = productPersistencePort;
    }

    @Override
    public void saveProduct(Product product) {
        productPersistencePort.saveProduct(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productPersistencePort.getAllProduct();
    }

    @Override
    public Product getProduct(Long productId) {
        return productPersistencePort.getProduct(productId);
    }

    @Override
    public void updateProduct(Product product) {
        productPersistencePort.updateProduct(product);
    }

    @Override
    public void deleteProduct(Long productId) {
        productPersistencePort.deleteProduct(productId);
    }
}
