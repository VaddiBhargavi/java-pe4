package com.stackroute.junitdemo;

public class Transposer {
    public String transpose(String str) {
        String reversedString = "";
        //If given input is null
        if (str == null) {
            return "Enter valid input";
        }
        //If given input is empty
        else if (str == " ") {
            return "Enter valid input";
        } else {
            String[] words = str.split(" ");
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                String reverseWord = "";
                for (int j = word.length() - 1; j >= 0; j--) {
                    reverseWord = reverseWord + word.charAt(j);
                }
                reversedString = reversedString + reverseWord + " ";
            }
            return reversedString.trim();//returns the transpose of the string
        }
    }
}
