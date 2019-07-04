package com.stackroute.junitdemo;

public class Sorting {
    public String sortchecker(String input)
    {
        int i=0,j=0;
        String result=" ";

        //If given input is null
        if (input == null) {
            return "Enter valid input";
        }
        //If given input is empty
        else if (input == " ")
        {
            return "Enter valid input";
        }
        else {
            //Logic for sorting of the given text
            String[] input1 = input.split(" ");
            for (i = 0; i < input1.length - 1; i++) {
                for (j = i + 1; j < input1.length - 1; j++) {
                    if (input1[i].compareTo(input1[j]) > 0) {
                        String temp = input1[i];
                        input1[i] = input1[j];
                        input1[j] = temp;
                    }
                }
            }
        for(i=0; i<= input1.length-1;i++)
        {
            result += input1[i]+" ";
        }
            return result.trim();//Prints the result
    }
}}
