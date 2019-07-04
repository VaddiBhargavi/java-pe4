package com.stackroute.junitdemo;

public class ReplaceCharacter {
    public String replacer(String input) {
        String result = " ";
        //If given input is null
        if (input == null) {
            return "Enter valid input";
        }
        //If given input is empty
        else if (input == " ")
        {
            return "Enter valid input";
        }
        else
            {
            //Replaces the characters with the given characters
                String input1 = input.toLowerCase();
            String count1 = input1.replaceAll("d", "f");
            String count2 = count1.replaceAll("l", "t");
            result = "After replacement, the string looks like-" + count2;
        }
        return result; //Prints result
    }
}
