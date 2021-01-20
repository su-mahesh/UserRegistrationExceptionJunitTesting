package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class LastNameTest
{
    @Test
    public void given_FirstLetterSmall_ShouldThrowException() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            Boolean flag = userRegistration.lastNameTesting("mahesh");
            Assert.assertEquals(flag, false);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_FIRST_LETTER_SMALL, e.exceptionType);
        }
    }

    @Test
    public void given_LessThan_3Letters_ShouldThrowException(){
        try {
            UserRegistration userRegistration = new UserRegistration();
            Boolean flag = userRegistration.lastNameTesting("Ma");
            Assert.assertEquals(flag, false);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_LESS_THAN_3_LETTERS, e.exceptionType);
        }
    }

    @Test
    public void given_firstLetterCapLength3_ShouldReturnTrue()throws UserRegistrationException{

        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.lastNameTesting("Mahesh");
        Assert.assertEquals(flag, true);

    }

    @Test
    public void given_Null_ShouldThrowNullException(){
        try {
            UserRegistration userRegistration = new UserRegistration();
            Boolean flag = userRegistration.lastNameTesting(null);
            Assert.assertEquals(flag, true);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
        }
    }

}
