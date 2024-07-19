package com.demo1.productservices.services;

import com.demo1.productservices.exceptions.productNotFoundException;
import com.demo1.productservices.models.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SelfProductService")

public class SelfProductService implements ProductService {
    @Override
    public Product getSingleProduct(long id) throws productNotFoundException {
        return null;
    }

    @Override
    public List<Product> getAllProduct() {
        return List.of();
    }

    @Override
    public Product updateProduct(long id, Product product) {
        return null;
    }

    @Override
    public Product ReplaceProduct(long id, Product product) {
        return null;
    }

    @Override
    public Product deleteProduct(Long id) {
        return null;
    }
}
