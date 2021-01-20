package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class LastNameTest
{

    @Test
    public void given_FirstLetterSmall_ShouldReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.lastNameTesting("kangude");
        Assert.assertEquals(flag, false);
    }

    @Test
    public void given_LessThan_3letters_ShouldReturnFalse(){

        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.lastNameTesting("ma");
        Assert.assertEquals(flag, false);
    }

    @Test
    public void given_SecondLetterCap_ShouldReturnFalse(){

        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.lastNameTesting("ma");
        Assert.assertEquals(flag, false);
    }

    @Test
    public void given_firstLetterCapLength3_ShouldReturnTrue(){

        UserRegistration userRegistration = new UserRegistration();
        Boolean flag = userRegistration.lastNameTesting("Mahesh");
        Assert.assertEquals(flag, true);
    }
}
