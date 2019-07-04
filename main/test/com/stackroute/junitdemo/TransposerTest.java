package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposerTest {
    Transposer transposer;
    @Before
    public void setUp(){
        transposer=new Transposer();
    }
    @After
    public void tearDown(){
        transposer=null;
    }
    @Test
    public void givenTextShouldPrintTranspose() {
//Arrange
//Act
        String result = transposer.transpose("hello hai");
//Assert
        assertEquals("olleh iah",result);
    }
    @Test
    public void givenEmptyStringShouldPrintError() {
//Arrange
//Act
        String result = transposer.transpose(" ");
//Assert
        assertEquals("Enter valid input", result);
    }
    @Test
    public void givenNullShouldPrintError() {
//Arrange
//Act
        String result = transposer.transpose(null);
//Assert
        assertEquals("Enter valid input", result);
    }
}