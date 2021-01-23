package com.bridgelabz;
import java.util.regex.Pattern;

interface UserInputValidate{

    boolean validateInput(String pattern, String input);
}
public class UserRegistration implements UserInputValidate{
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
    @Override
    public boolean validateInput(String pattern, String input) {
        return !Pattern.matches(pattern, input);
    }

    public boolean validateFirstName(String firstName)throws UserRegistrationException {
        try{
            if(validateInput(firstNamePattern, firstName))
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_INPUT, "please enter proper field");
            return true;
        }catch (NullPointerException e){
        throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "please enter proper field");
        }
    }

    public boolean validateLastName(String lastName)throws UserRegistrationException {
        try{
            if(validateInput(lastNamePattern, lastName))
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_INPUT, "please enter proper field");
            return true;
        }catch (NullPointerException e){
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "please enter proper field");
        }
    }

    public boolean validateEmailAddress(String emailAddress)throws UserRegistrationException {
        try{
            if(validateInput(emailAddressPattern, emailAddress))
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_INPUT, "please enter proper field");
            return true;
        }catch (NullPointerException e){
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "please enter proper field");
        }
    }

    public boolean validatePassword(String password)throws UserRegistrationException {
        try{
            if(validateInput(passwordPattern, password))
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_INPUT, "please enter proper field");
            return true;
        }catch (NullPointerException e){
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "please enter proper field");
        }
    }

    public boolean validateMobileNumber(String mobileNumber)throws UserRegistrationException {
        try{
            if(validateInput(mobileNumberPattern, mobileNumber))
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_INPUT, "please enter proper field");
            return true;
        }catch (NullPointerException e){
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "please enter proper field");
        }
    }

    public boolean validateEmailAddressParameters(String emailAddress) {
          return !validateInput(emailAddressPattern, emailAddress);
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

        System.out.println(userRegistration.validateFirstName("Mahesh"));
        System.out.println(userRegistration.validateLastName("Kangude"));
        System.out.println(userRegistration.validateEmailAddress("abc@com.in"));
        System.out.println(userRegistration.validateMobileNumber("91 8473652883"));
        System.out.println(userRegistration.validatePassword("fefe&Jrlm9fefef"));
        userRegistration.clearEmailList();

    }


}

