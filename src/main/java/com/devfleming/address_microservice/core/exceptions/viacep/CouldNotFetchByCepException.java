package com.devfleming.address_microservice.core.exceptions.viacep;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CouldNotFetchByCepException extends RuntimeException {
    public CouldNotFetchByCepException(String message) {
        super(message);
    }
}
