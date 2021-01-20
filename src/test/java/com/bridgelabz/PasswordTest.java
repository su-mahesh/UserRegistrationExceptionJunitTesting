package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class PasswordTest {

    @Test
    public void given_lessThan_8_Char_ShouldReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.passwordTesting("pa8$Wor");
        Assert.assertEquals(flag, false);
    }

    @Test
    public void given_twoSpecialChar_ShouldReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.passwordTesting("pa8$W@rd");
        Assert.assertEquals(flag, false);
    }

    @Test
    public void given_noneDigit_ShouldReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.passwordTesting("pas$Word");
        Assert.assertEquals(flag, false);
    }

    @Test
    public void given_1Cap_1Digit_1SpecialChar_length8_ShouldReturnTrue() {

        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.passwordTesting("pa8$Word");
        Assert.assertEquals(flag, true);
    }

}
