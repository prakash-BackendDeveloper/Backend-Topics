package com.demo1.productservices.controllerAdvice;

import com.demo1.productservices.dto.ExceptionDto;
import com.demo1.productservices.exceptions.productNotFoundException;
import com.demo1.productservices.models.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ExceptionDto>  arithmeticExceptionHandler(){
        ExceptionDto exceptionDto = new ExceptionDto();
        exceptionDto.setMessage("Something went wrong");
        exceptionDto.setSolution("I dont know, Please try it again");
        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(
                exceptionDto,
                HttpStatus.NOT_FOUND
        );
        return response;
    }

    @ExceptionHandler(productNotFoundException.class)
    public ResponseEntity<ExceptionDto>  productNotFoundExceptionHandler(productNotFoundException exception){
        ExceptionDto exceptionDto = new ExceptionDto();
        exceptionDto.setMessage("The Given Product_id " + exception.getProductId()+" is not valid");
        exceptionDto.setSolution("Please try it again with a valid id");
        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(
                exceptionDto,
                HttpStatus.NOT_FOUND
        );
        return response;
    }
}
