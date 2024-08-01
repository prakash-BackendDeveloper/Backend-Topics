package com.demo1.productservices.exceptions;

public class productNotFoundException extends Exception{
    private long productId;
   public productNotFoundException(long productId){
       super("Product id is not found");
       this.productId =  productId;
   }
   public long getProductId() {
       return productId;
   }
}
