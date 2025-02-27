package com.ndd.repository.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ndd.entity.ProductEntity;
import com.ndd.repository.ProductRepository;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public ProductEntity createProduct(ProductEntity product) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setId(1L);
        productEntity.setProductName("T-shirt");
        productEntity.setProductPrice(new BigDecimal(21.6));
        return productEntity;
    }

    @Override
    public List<ProductEntity> findAllProducts() {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setId(1L);
        productEntity.setProductName("T-shirt");
        productEntity.setProductPrice(new BigDecimal(21.6));
        return List.of(productEntity);
    }

}
