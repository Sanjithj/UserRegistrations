package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
      public static void checkValidLastName(String lastName) {

        boolean isLastName;
        String lastNames = "[A-Z]{1}[a-z]{2,}";
        Pattern patternObject = Pattern.compile(lastNames);
        if (lastName == null) {
            isLastName = false;
        }
        Matcher matcherObject = patternObject.matcher(lastName);
        isLastName = matcherObject.matches();

        if (isLastName)
            System.out.println(lastName + " Valid Last Name");
        else
            System.err.println(lastName + " Invalid Last Name");
    }

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter Your Last Name");
        String lastName = scannerObject.next();
        checkValidLastName(lastName);

        scannerObject.close();
    }
 
}
	   

