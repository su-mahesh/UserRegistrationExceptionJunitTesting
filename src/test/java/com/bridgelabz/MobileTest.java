package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MobileTest {

    @Test
    public void given_anyChar_ShouldReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.mobileNumberTesting("91 893f323456");
        Assert.assertEquals(flag, false);
    }

    @Test
    public void given_9digits_ShouldReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.mobileNumberTesting("123456789");
        Assert.assertEquals(flag, false);
    }

    @Test
    public void given_10digitsWithCountryCode_ShouldReturnTrue() {

        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.mobileNumberTesting("91 1234567890");
        Assert.assertEquals(flag, true);
    }

    @Test
    public void given_withoutSpace_ShouldReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.mobileNumberTesting("911234567890");
        Assert.assertEquals(flag, false);
    }

}
