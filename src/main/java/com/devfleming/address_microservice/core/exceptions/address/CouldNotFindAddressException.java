package com.devfleming.address_microservice.core.exceptions.address;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CouldNotFindAddressException extends RuntimeException {
    public CouldNotFindAddressException(String message) {
        super(message);
    }
}
