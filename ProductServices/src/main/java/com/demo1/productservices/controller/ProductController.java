package com.demo1.productservices.controller;

import com.demo1.productservices.exceptions.productNotFoundException;
import com.demo1.productservices.models.Product;
import com.demo1.productservices.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    ProductService productService;

    public ProductController(@Qualifier("SelfProductService") ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getSingleProductById(@PathVariable("id") int id) throws productNotFoundException {
        //Directly throw an exception
         //throw new RuntimeException("Something went wrong");


        //throw an exception using try and catch block
//        ResponseEntity<Product> responseEntity =null;
//        try{
//            Product product=productService.getSingleProduct(id);
//            responseEntity =new ResponseEntity<>(
//                product, HttpStatus.OK
//        );
//        }
//        catch (Exception e){
//             responseEntity =new ResponseEntity<>(
//                HttpStatus.NOT_FOUND
//        );
//        }

//        return responseEntity;


       // this is for HTTP status
        ResponseEntity<Product> responseEntity =new ResponseEntity<>(
                productService.getSingleProduct(id), HttpStatus.FORBIDDEN
        );
        return responseEntity;

    }

    @GetMapping()
    public List<Product> getAllProducts(){
        return productService.getAllProduct();
    }

    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable("id") long id,@RequestBody Product product) {
        return productService.updateProduct(id,product);
    }

    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") long id,@RequestBody Product product) {
        return productService.ReplaceProduct(id,product);
    }

    @DeleteMapping("/{id}")
    public Product deleteProduct(@PathVariable("id") Long id) {
        return productService.deleteProduct(id);
    }
//    @ExceptionHandler(ArithmeticException.class)
//    public ResponseEntity<String>  arithmeticExceptionHandler(){
//        ResponseEntity<String> response = new ResponseEntity<>(
//                "Something went wrong by Controller",
//                HttpStatus.NOT_FOUND
//        );
//        return response;
//    }
}
