package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class EmailAddressTest {

   @Test
    public void given_noAtSymbol_ShouldThrowException()  {
       UserRegistration userRegistration = new UserRegistration();
       try {
        Boolean flag = userRegistration.emailAddressTesting("mahesh..kangudegmail.com");
    }catch (UserRegistrationException e) {
        Assert.assertEquals(UserRegistrationException.ExceptionType.NO_AT_SYMBOL, e.exceptionType);
    }
    }

    @Test
    public void given_startWithDot_ShouldThrowException()  {

        UserRegistration userRegistration = new UserRegistration();
        try {
        Boolean flag = userRegistration.emailAddressTesting("maheshkangude@gmail.com.co.in");
        }catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.SHOULD_NOT_START_WITH_DOT, e.exceptionType);
        }
    }

    @Test
    public void given_3LetterUserName5letterDomain_withMiddleDot_ShouldReturnTrue() throws UserRegistrationException {

        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.emailAddressTesting("mah@gm.com");
        Assert.assertEquals(flag, true);
    }
}
