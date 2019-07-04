package com.stackroute.junitdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurances {
        public static String count(String input1, String input2)
        {
            String result= " ";
        //Check if input is null
            if(input1== null || input2== null)
            {
                return "Enter valid input";
            }
            //Checks if input is empty
            else if(input1==" " || input2== " ")
            {
                return "Enter valid input";
            }
        else{
                // Create a pattern to be searched
                Pattern pattern = Pattern.compile(input2);
                // Search above pattern
                Matcher m = pattern.matcher(input1);
            // Print starting and ending indexes of the pattern
            while (m.find()){
                result += m.start() +
                        " to " + (m.end()-1)+",";
        }return result.trim();
    }}
}
