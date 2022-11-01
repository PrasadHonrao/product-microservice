package com.northwind.services.product.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.ConstraintViolationException;

/*
* This class is primarily used when request payload invalidates model constraints applied during HTTP operation
*/

@ControllerAdvice
public class ControllerConfiguration {
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(value= HttpStatus.BAD_REQUEST, reason = "not a valid request payload")
    public void notValid() {
        System.out.println("bad request");
        // add your custom code here.
    }
}
