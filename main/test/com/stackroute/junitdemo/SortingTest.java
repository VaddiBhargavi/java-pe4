package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {
    Sorting sorting;
    @Before
    public void setUp()
    {
        sorting =new Sorting();
    }
    @After
    public void tearDown()
    {
        sorting =null;
    }
    @Test
    public void givenTextShouldPrintInSortedOrder() {
//Arrange
//Act
        String result = sorting.sortchecker("i am pandu");
//Assert
        assertEquals("am i pandu", result);
    }
    @Test
    public void givenEmptyStringShouldPrintError() {
//Arrange
//Act
        String result = sorting.sortchecker(" ");
//Assert
        assertEquals("Enter valid input", result);
    }
    @Test
    public void givenNullShouldPrintError() {
//Arrange
//Act
        String result = sorting.sortchecker(null);
//Assert
        assertEquals("Enter valid input", result);
    }
}