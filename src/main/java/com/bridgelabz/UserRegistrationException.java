package com.bridgelabz;

public class UserRegistrationException extends Exception{

    public enum ExceptionType {
        INVALID_INPUT, ENTERED_NULL
    }
    ExceptionType exceptionType;

    public UserRegistrationException(ExceptionType exceptionType, String message) {
        super(message);
        this.exceptionType = exceptionType;
    }
}
