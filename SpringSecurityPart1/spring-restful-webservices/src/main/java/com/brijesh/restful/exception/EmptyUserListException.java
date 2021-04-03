package com.brijesh.restful.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmptyUserListException extends RuntimeException{
    public EmptyUserListException(String message) {
        super(message);
    }
}