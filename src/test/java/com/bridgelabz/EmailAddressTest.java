package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class EmailAddressTest {

    @Test
    public void given_2dotsinUserName_ShouldReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.emailAddressTesting("mahesh..kangude@gmail.com");
        Assert.assertEquals(flag, false);
    }

    @Test
    public void given_3dotsinDomain_ShouldReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.emailAddressTesting("maheshkangude@gmail.com.co.in");
        Assert.assertEquals(flag, false);
    }

    @Test
    public void given_3LetterUserName5letterDomain_withMiddleDot_ShouldReturnTrue() {

        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.emailAddressTesting("mah@gm.com");
        Assert.assertEquals(flag, true);
    }
}
