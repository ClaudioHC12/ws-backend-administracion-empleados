package com.example.sysdb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ForeignKeyNotFoundException extends RuntimeException {
    public ForeignKeyNotFoundException(String message) {
        super(message);
    }
}
