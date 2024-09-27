package com.devfleming.address_microservice.core.exceptions;

import com.devfleming.address_microservice.core.dto.ErrorResponseDto;
import com.devfleming.address_microservice.core.exceptions.address.CouldNotCreateAddressException;
import com.devfleming.address_microservice.core.exceptions.address.CouldNotFetchByIdException;
import com.devfleming.address_microservice.core.exceptions.address.CouldNotFindAddressException;
import com.devfleming.address_microservice.core.exceptions.address.CouldNotUpdateAddressException;
import com.devfleming.address_microservice.core.exceptions.viacep.CouldNotFetchByCepException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CouldNotCreateAddressException.class)
    public ResponseEntity<ErrorResponseDto> handleCouldNotCreateAddressException(CouldNotCreateAddressException exception,
                                                                                 WebRequest webRequest){

        ErrorResponseDto error = ErrorResponseDto.builder()
            .apiPath(webRequest.getDescription(false))
            .errorCode(HttpStatus.BAD_REQUEST)
            .errorMessage(exception.getMessage())
            .errorTime(LocalDateTime.now())
            .build();
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CouldNotFetchByCepException.class)
    public ResponseEntity<ErrorResponseDto> handleCouldNotFetchByCepException(CouldNotFetchByCepException exception,
                                                                 WebRequest webRequest){

        ErrorResponseDto error = ErrorResponseDto.builder()
                .apiPath(webRequest.getDescription(false))
                .errorCode(HttpStatus.NOT_FOUND)
                .errorMessage(exception.getMessage())
                .errorTime(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(CouldNotFetchByIdException.class)
    public ResponseEntity<ErrorResponseDto> handleCouldNotFetchByIdException(CouldNotFetchByIdException exception,
                                                                              WebRequest webRequest){

        ErrorResponseDto error = ErrorResponseDto.builder()
                .apiPath(webRequest.getDescription(false))
                .errorCode(HttpStatus.NOT_FOUND)
                .errorMessage(exception.getMessage())
                .errorTime(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(CouldNotFindAddressException.class)
    public ResponseEntity<ErrorResponseDto> handleCouldNotFindAddressException(CouldNotFindAddressException exception,
                                                                              WebRequest webRequest){

        ErrorResponseDto error = ErrorResponseDto.builder()
                .apiPath(webRequest.getDescription(false))
                .errorCode(HttpStatus.NOT_FOUND)
                .errorMessage(exception.getMessage())
                .errorTime(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(CouldNotUpdateAddressException.class)
    public ResponseEntity<ErrorResponseDto> handleCouldNotUpdateAddressException(CouldNotUpdateAddressException exception,
                                                                               WebRequest webRequest){

        ErrorResponseDto error = ErrorResponseDto.builder()
                .apiPath(webRequest.getDescription(false))
                .errorCode(HttpStatus.BAD_REQUEST)
                .errorMessage(exception.getMessage())
                .errorTime(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
