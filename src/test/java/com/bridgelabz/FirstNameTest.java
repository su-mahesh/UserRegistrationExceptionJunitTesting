package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class FirstNameTest {

    @Test
    public void given_FirstLetterSmall_ShouldThrowException() {
    try {
        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.firstNameTesting("mahesh");
    } catch (UserRegistrationException e) {
        Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_FIRST_LETTER_SMALL, e.exceptionType);
    }
    }

    @Test
    public void given_LessThan_3Letters_ShouldThrowException(){
    try {
        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.firstNameTesting("Ma");
    } catch (UserRegistrationException e) {
        Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_LESS_THAN_3_LETTERS, e.exceptionType);
    }
    }

    @Test
    public void given_firstLetterCapLength3_ShouldReturnTrue()throws UserRegistrationException{

        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.firstNameTesting("Mahesh");
        Assert.assertEquals(flag, true);
    }

    @Test
    public void given_Null_ShouldThrowNullException(){
        try {
        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.firstNameTesting(null);
    } catch (UserRegistrationException e) {
        Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
    }
    }
    @Test
    public void given_Empty_ShouldThrowEmptyException(){
        try {
            UserRegistration userRegistration = new UserRegistration();
            Boolean flag = userRegistration.firstNameTesting("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
        }
    }
}
