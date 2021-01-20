package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class PasswordTest {

    @Test
    public void given_lessThan_8_Char_ShouldThrowException() {
        UserRegistration userRegistration = new UserRegistration();
        try {    Boolean flag = userRegistration.passwordTesting("pa8$Wor");
        }catch (UserRegistrationException e) {
        Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_LESS_THAN_8_CHARS, e.exceptionType);
    }
    }

    @Test
    public void given_whiteSpace_ShouldThrowException() {

        UserRegistration userRegistration = new UserRegistration();
        try {
        Boolean flag = userRegistration.passwordTesting("pa8 $W@rd");
        Assert.assertEquals(flag, false);
    }catch (UserRegistrationException e) {
        Assert.assertEquals(UserRegistrationException.ExceptionType.CONTAINS_SPACE, e.exceptionType);
    }
    }


    @Test
    public void given_1Cap_1Digit_1SpecialChar_length8_ShouldReturnTrue() throws UserRegistrationException {

        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.passwordTesting("pa8$Word");
        Assert.assertEquals(flag, true);
    }

}
