package com.bridgelabz;
import java.util.regex.Pattern;

public class UserRegistration {
    final private String firstNamePattern = "[A-Z][a-z]{2,}";
    final private String lastNamePattern = "[A-Z][a-z]{2,}";
    final private String emailAddressPattern = "[A-Za-z0-9_][+A-Za-z0-9_-]*[.]?[+A-Za-z0-9_-]+[@]([A-Za-z0-9]+[.][A-Za-z]{2,63}|[A-Za-z0-9-]{2,}[.][A-Za-z0-9]{2,63}[.][A-Za-z]{2,3})";

    public boolean firstNameTesting(String firstName) {
        return Pattern.matches(firstNamePattern, firstName);
    }

    public boolean lastNameTesting(String lastName) {
        return Pattern.matches(lastNamePattern, lastName);
    }

    public boolean emailAddressTesting(String emailAddress) {
        return Pattern.matches(emailAddressPattern, emailAddress);
    }

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();

        System.out.println(userRegistration.firstNameTesting("Mahesh"));
        System.out.println(userRegistration.lastNameTesting("Kangude"));
        System.out.println(userRegistration.emailAddressTesting("abc@com.in"));
    }
}

