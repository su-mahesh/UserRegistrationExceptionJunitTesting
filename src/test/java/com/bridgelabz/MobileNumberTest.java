package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MobileNumberTest {

    @Test
    public void given_lessNumber_ShouldThrowException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            Boolean flag = userRegistration.mobileNumberTesting("91 893f323456");
            Assert.assertEquals(flag, false);
        }catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_LESS_NUMBERS, e.exceptionType);
        }
    }

    @Test
    public void given_moreNumbers_ShouldThrowException() {

        UserRegistration userRegistration = new UserRegistration();
        try {
        Boolean flag = userRegistration.mobileNumberTesting("12 37454456789");
        Assert.assertEquals(flag, false);

    }catch (UserRegistrationException e) {
        Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_MORE_NUMBERS, e.exceptionType);
    }
    }

   @Test
    public void given_noSpace_ShouldThrowException() {
    try {
        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.mobileNumberTesting("9112345678909");
        Assert.assertEquals(flag, true);
    }catch (UserRegistrationException e) {
        Assert.assertEquals(UserRegistrationException.ExceptionType.SPACE_NOT_ENTERED, e.exceptionType);
    }
    }


}
