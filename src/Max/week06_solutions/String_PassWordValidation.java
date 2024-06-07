package Max.week06_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String_PassWordValidation {

    /*
    Write a function that can verify if a password is valid or not. requirements:
                1. Password MUST be at least have 6 characters and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lowercase letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

        if all requirements above are met, the method returns true, otherwise returns false
     */
    public static boolean passwordIsValid(String password){

        if (password.length() < 6 || password.contains(" ")){
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))){
                    hasUpperCase = true;
                } else if (Character.isLowerCase(password.charAt(i))) {
                    hasLowerCase = true;
                } else if (Character.isDigit(password.charAt(i))) {
                    hasDigit = true;
                } else if (!Character.isLetterOrDigit(password.charAt(i))) {
                    hasSpecialChar =true;
                }

        }

        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;

    }




    public static void main(String[] args) {

        System.out.println(passwordIsValid("123Abc?"));
    }





}
