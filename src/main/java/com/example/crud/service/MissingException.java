package com.example.crud.service;

public class MissingException extends RuntimeException {
    MissingException(){
        super("Student doesn't exist in DB");
    }
    MissingException(String msg) {
        super(msg);
    }
}
