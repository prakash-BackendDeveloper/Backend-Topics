package com.demo1.productservices.services;

import com.demo1.productservices.exceptions.productNotFoundException;
import com.demo1.productservices.models.Product;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(long id) throws productNotFoundException;

    List<Product> getAllProduct();

    Product updateProduct(long id, Product product);

    Product ReplaceProduct(long id, Product product);

    Product deleteProduct(Long id);

    //void deleteProduct(long id);
}
