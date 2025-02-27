package com.ndd.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ndd.entity.ProductEntity;

@Repository
public interface ProductRepository {

    ProductEntity createProduct(ProductEntity product);

    List<ProductEntity> findAllProducts();
}
