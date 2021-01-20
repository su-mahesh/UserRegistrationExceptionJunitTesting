package com.bridgelabz;
import java.util.regex.Pattern;

public class UserRegistration {
    final private String firstNamePattern = "[A-Z][a-z]{2,}";

    public boolean firstNameTesting(String firstName) {
        return Pattern.matches(firstNamePattern, firstName);
    }

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();

        System.out.println(userRegistration.firstNameTesting("Mahesh"));
    }
}

