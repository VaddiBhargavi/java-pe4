package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurancesTest {
    MultipleOccurances multipleOccurances;
    @Before
    public void setUp()
    {
        multipleOccurances =new MultipleOccurances();
    }
    @After
    public void tearDown()
    {
        multipleOccurances =null;
    }
    @Test
    public void givenStringShouldResultWithCountOfGievnCharcters() {
//Arrange
//Act
        String result = multipleOccurances.count("She sells seashells by the seashore","se");
//Assert
        assertEquals("4 to 5,10 to 11,27 to 28,", result);
    }
    @Test
    public void ifGivenStringIsEmptyShouldResultError() {
//Arrange
//Act
        String result = multipleOccurances.count(" "," ");
//Assert
        assertEquals("Enter valid input", result);
    }
    @Test
    public void ifGivenStringIsNullShouldResultError() {
//Arrange
//Act
        String result = multipleOccurances.count(null,null);
//Assert
        assertEquals("Enter valid input", result);
    }
}