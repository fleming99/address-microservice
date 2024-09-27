package com.devfleming.address_microservice.core.exceptions.address;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CouldNotCreateAddressException extends RuntimeException {
    public CouldNotCreateAddressException(String message) {
        super(message);
    }
}
