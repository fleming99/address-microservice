package com.devfleming.address_microservice.core.exceptions.address;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CouldNotUpdateAddressException extends RuntimeException {
    public CouldNotUpdateAddressException(String message) {
        super(message);
    }
}
