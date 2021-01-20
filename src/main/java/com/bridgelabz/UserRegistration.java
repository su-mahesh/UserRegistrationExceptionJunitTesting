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

    public boolean firstNameTesting(String firstName)throws UserRegistrationException {
        try {
            if(!Pattern.matches(firstNamePattern, firstName)){
                if (firstName.length() == 0)
                    throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY, "please enter proper field");
                else if(!Character.isUpperCase(firstName.charAt(0)))
                    throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_FIRST_LETTER_SMALL, "please enter proper field");
                else if (firstName.length() < 3 )
                    throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_LESS_THAN_3_LETTERS, "please enter proper field");

            }
        return  Pattern.matches(firstNamePattern, firstName);
        }catch (NullPointerException e){
        throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "please enter proper message");
        }
    }

    public boolean lastNameTesting(String lastName) throws UserRegistrationException{
        try {
        if(!Pattern.matches(lastNamePattern, lastName)){
            if(!Character.isUpperCase(lastName.charAt(0)))
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_FIRST_LETTER_SMALL, "please enter proper field");
            else if (lastName.length() < 3)
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_LESS_THAN_3_LETTERS, "please enter proper field");

        }
        return  Pattern.matches(firstNamePattern, lastName);


    }catch (NullPointerException e){
        throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "please enter proper message");
    }
    }

    public boolean emailAddressTesting(String emailAddress) throws UserRegistrationException {

        try {
            if(!Pattern.matches(emailAddressPattern, emailAddress)){
                if(!emailAddress.contains("@"))
                    throw new UserRegistrationException(UserRegistrationException.ExceptionType.NO_AT_SYMBOL, "please enter proper field");
                else if (emailAddress.charAt(0) == '.')
                    throw new UserRegistrationException(UserRegistrationException.ExceptionType.SHOULD_NOT_START_WITH_DOT, "please enter proper field");
            }
            return  Pattern.matches(emailAddressPattern, emailAddress);
        }catch (NullPointerException e){
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "please enter proper message");
        }
    }

    public boolean mobileNumberTesting(String mobileNumber)throws UserRegistrationException{
        try {
            if(!Pattern.matches(mobileNumberPattern, mobileNumber)){
                if(mobileNumber.length() < 13)
                    throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_LESS_NUMBERS, "please enter proper field");
                else if (mobileNumber.length() > 13)
                    throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_MORE_NUMBERS, "please enter proper field");
                else if (!mobileNumber.contains(" "))
                    throw new UserRegistrationException(UserRegistrationException.ExceptionType.SPACE_NOT_ENTERED, "please enter proper field");
            }
            return  Pattern.matches(mobileNumberPattern, mobileNumber);
        }catch (NullPointerException e){
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "please enter proper message");
        }
    }

    public boolean passwordTesting(String password) throws UserRegistrationException {
        try {
        if(!Pattern.matches(passwordPattern, password)){
            if(password.length() < 8)
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_LESS_THAN_8_CHARS, "please enter proper field");
            else if (password.contains(" "))
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.CONTAINS_SPACE, "please enter proper field");
        }
        return  Pattern.matches(passwordPattern, password);
    }catch (NullPointerException e){
        throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "please enter proper message");
    }
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
    public static void main(String[] args) throws UserRegistrationException {

        UserRegistration userRegistration = new UserRegistration();

        System.out.println(userRegistration.firstNameTesting("Mahesh"));
        System.out.println(userRegistration.lastNameTesting("Kangude"));
        System.out.println(userRegistration.emailAddressTesting("abc@com.in"));
        System.out.println(userRegistration.mobileNumberTesting("91 8473652883"));
        System.out.println(userRegistration.passwordTesting("fefe&Jrlm9fefef"));
        userRegistration.clearEmailList();

    }
}

