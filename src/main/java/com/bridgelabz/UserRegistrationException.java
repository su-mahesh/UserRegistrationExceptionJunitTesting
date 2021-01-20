package com.bridgelabz;

public class UserRegistrationException extends Exception{

    public enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY, ENTERED_FIRST_LETTER_SMALL, ENTERED_LESS_THAN_3_LETTERS,
        ENTERED_LESS_NUMBERS, ENTERED_MORE_NUMBERS, SPACE_NOT_ENTERED, ENTERED_LESS_THAN_8_CHARS,
        CONTAINS_SPACE, NO_AT_SYMBOL, SHOULD_NOT_START_WITH_DOT,
    }
    ExceptionType exceptionType;

    public UserRegistrationException(ExceptionType exceptionType, String message) {
        super(message);
        this.exceptionType = exceptionType;
    }
}
