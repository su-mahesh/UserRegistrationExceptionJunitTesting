package com.bridgelabz;
import java.util.regex.Pattern;

public class UserRegistration {
    final private String firstNamePattern = "[A-Z][a-z]{2,}";
    final private String lastNamePattern = "[A-Z][a-z]{2,}";
    final private String emailAddressPattern = "[A-Za-z0-9_][+A-Za-z0-9_-]*[.]?[+A-Za-z0-9_-]+[@]([A-Za-z0-9]+[.][A-Za-z]{2,63}|[A-Za-z0-9-]{2,}[.][A-Za-z0-9]{2,63}[.][A-Za-z]{2,3})";
    final private String mobileNumberPattern = "^[1-9][0-9]{0,2}\\s[0-9]{10}";
    final private String passwordPattern = "^(?=.{8,20}$)(?=.*[0-9])(?=.*[A-Z])[A-Za-z0-9]*[^A-Za-z0-9][A-Za-z0-9]*$";
    String[] emailAcceptList = new String[]{"abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com"};

    String[] emailRejectList = new String[]{
            "abc",
            "abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@%*.com",
            "abc..2002@gmail.com",
            "abc.@gmail.com",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.au"
    };

    public boolean firstNameTesting(String firstName) {
        return Pattern.matches(firstNamePattern, firstName);
    }

    public boolean lastNameTesting(String lastName) {
        return Pattern.matches(lastNamePattern, lastName);
    }

    public boolean emailAddressTesting(String emailAddress) {
        return Pattern.matches(emailAddressPattern, emailAddress);
    }

    public boolean mobileNumberTesting(String mobileNumber) {
        return Pattern.matches(mobileNumberPattern, mobileNumber);
    }

    public boolean passwordTesting(String password) {
        return Pattern.matches(passwordPattern, password);
    }
    public boolean emailTesting(String email) {
        return Pattern.matches(emailAddressPattern, email);
    }

    public void clearEmailList(){
        int i;
        System.out.println("\n***must accept list***");

        for(i = 0; i < emailAcceptList.length; i++ ){

            System.out.println((i+1)+": "+emailAcceptList[i]);
            if(Pattern.matches(emailAddressPattern, emailAcceptList[i])){

                System.out.println("pattern matched\n");
            }
            else
                System.out.println("pattern did not matched\n");
        }

        System.out.println("***must reject list***");

        for( i = 0; i < emailRejectList.length; i++ ){

            System.out.println((i+1)+": "+emailRejectList[i]);
            if(Pattern.matches(emailAddressPattern, emailRejectList[i])){

                System.out.println("pattern matched\n");
            }
            else
                System.out.println("pattern did not matched\n");
        }
    }
    public static void main(String[] args) {

        UserRegistration userRegistration = new UserRegistration();

        System.out.println(userRegistration.firstNameTesting("Mahesh"));
        System.out.println(userRegistration.lastNameTesting("Kangude"));
        System.out.println(userRegistration.emailAddressTesting("abc@com.in"));
        System.out.println(userRegistration.mobileNumberTesting("91 8473652883"));
        System.out.println(userRegistration.passwordTesting("fefe&Jrlm9fefef"));
        userRegistration.clearEmailList();

    }
}

