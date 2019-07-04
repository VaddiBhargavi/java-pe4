package com.stackroute.junitdemo;

public class CountOfCharacter {
    public String characterChecker(String input, char letter)
    {
        String result=" ";
        String input1=input.toLowerCase();
        //Check if input is null
        if(input1== null)
        {
            return "Enter valid input";
        }
        //Check if input is empty
        else if(input1==" " || letter== ' ')
        {
            return "Enter valid input";
        }
        //Count of given character
        else{
        int count1 =input1.length();
        int count2 = input1.replaceAll(String.valueOf(letter),"").length();
        int finalcount= count1-count2;
        result = "Count of given character in a string=" +finalcount;
    } return result;//Prints the result
    }
}
