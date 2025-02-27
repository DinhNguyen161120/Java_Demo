package com.ndd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ndd.entity.ProductEntity;

@Service
public interface ProductService {

    ProductEntity createProduct(ProductEntity product);

    List<ProductEntity> findAllProducts();
}
