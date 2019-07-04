package com.stackroute.junitdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    boolean result=false;
    public boolean ExpressionChecker(String input,String sequence){
    //Check if input is empty
        if(input==" " || sequence==" ")
        {
            return false;
        }
        //Checks if input is null
        else if(input== null || sequence== null)
        {
            return false;
        }
        else {
            //Checks for the given string is present in the text
            Pattern pattern = Pattern.compile(sequence);
            Matcher m = pattern.matcher(input);
            if (m.find()) {
                result = true;
            }
            else {
                result = false;
            }
        }
        return result;//Prints the result
    }
}
