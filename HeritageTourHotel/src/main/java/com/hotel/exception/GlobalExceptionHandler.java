package com.hotel.exception;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
//Global Exception Handler 
@ControllerAdvice
public class GlobalExceptionHandler {


@Value(value="${data.exception.msg}")
private String msg;

@ExceptionHandler(value=HotelAlreadyExistsException.class)
public ResponseEntity<String> HotelAlreadyExistsException(HotelAlreadyExistsException pae)
{
return new ResponseEntity<String>(msg,HttpStatus.CONFLICT);
}

@Value(value="${data.exception.msg1}")
private String msg1;

@ExceptionHandler(value=HotelNotFound.class)
public ResponseEntity<String> HotelNotFound(HotelNotFound pin)
{
return new ResponseEntity<String>(msg1,HttpStatus.CONFLICT);
}
}