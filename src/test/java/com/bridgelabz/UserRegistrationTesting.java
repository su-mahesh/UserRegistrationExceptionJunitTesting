package com.bridgelabz;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class UserRegistrationTesting {
    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(EmailAddressTest.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println("email address test result: "+result.wasSuccessful());


    }
}
