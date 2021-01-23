package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class UserRegistrationTesting {

    UserRegistration userRegistration  = new UserRegistration();

    @Test
    public void givenFirstName_Valid_shouldReturnTrue() throws UserRegistrationException {
            assertTrue(userRegistration.validateFirstName("Abc"));
    }

    @Test
    public void givenFirstName_Invalid_shouldThrowCustomException(){
        try {
            assertTrue(userRegistration.validateFirstName("abc"));
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_INPUT, e.exceptionType);
        }
    }

    @Test
    public void givenFirstName_Null_shouldThrowCustomException(){
        try {
            assertTrue(userRegistration.validateFirstName(null));
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
        }
    }

    @Test
    public void givenLastName_Valid_shouldReturnTrue() throws UserRegistrationException {
        assertTrue(userRegistration.validateLastName("Abc"));
    }

    @Test
    public void givenLastName_Invalid_shouldThrowCustomException(){
        try {
            assertTrue(userRegistration.validateLastName("abc"));
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_INPUT, e.exceptionType);
        }
    }

    @Test
    public void givenLastName_Null_shouldThrowCustomException(){
        try {
            assertTrue(userRegistration.validateLastName(null));
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
        }
    }

    @Test
    public void givenEmailAddress_Valid_shouldReturnTrue() throws UserRegistrationException {
        assertTrue(userRegistration.validateEmailAddress("Abc@com.co.in"));
    }

    @Test
    public void givenEmailAddress_Invalid_shouldThrowCustomException(){
        try {
            assertTrue(userRegistration.validateEmailAddress("abc@.com"));
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_INPUT, e.exceptionType);
        }
    }

    @Test
    public void givenEmailAddress_Null_shouldThrowCustomException(){
        try {
            assertTrue(userRegistration.validateEmailAddress(null));
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
        }
    }

    @Test
    public void givenPassword_Valid_shouldReturnTrue() throws UserRegistrationException {
        assertTrue(userRegistration.validatePassword("Ab7&32Coef"));
    }

    @Test
    public void givenPassword_Invalid_shouldThrowCustomException(){
        try {
            assertTrue(userRegistration.validatePassword("abc"));
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_INPUT, e.exceptionType);
        }
    }

    @Test
    public void givenPassword_Null_shouldThrowCustomException(){
        try {
            assertTrue(userRegistration.validatePassword(null));
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
        }
    }

    @Test
    public void givenMobileNumber_Valid_shouldReturnTrue() throws UserRegistrationException {
        assertTrue(userRegistration.validateMobileNumber("91 9394959697"));
    }

    @Test
    public void givenMobileNumber_Invalid_shouldThrowCustomException(){
        try {
            assertTrue(userRegistration.validateMobileNumber("872738392"));
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_INPUT, e.exceptionType);
        }
    }

    @Test
    public void givenMobileNumber_Null_shouldThrowCustomException(){
        try {
            assertTrue(userRegistration.validateMobileNumber(null));
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
        }
    }
}
