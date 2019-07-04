package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharacterTest {
    ReplaceCharacter replaceCharacter;
    @Before
    public void setUp()
    {
        replaceCharacter =new ReplaceCharacter();
    }
    @After
    public void tearDown()
    {
        replaceCharacter =null;
    }
    @Test
    public void givenStringShouldReplaceWithGivenCharacters() {
//Arrange
//Act
        String result = replaceCharacter.replacer("daily dry");
//Assert
        assertEquals("After replacement, the string looks like-faity fry", result);
        assertNotNull(replaceCharacter.replacer("daily dry"));
    }
    @Test
    public void ifGivenStringIsNullShouldPrintError() {
//Arrange
//Act
        String result = replaceCharacter.replacer(null);
//Assert
        assertEquals("Enter valid input", result);
    }
    @Test
    public void ifGivenStringIsEmptyShouldPrintError() {
//Arrange
//Act
        String result = replaceCharacter.replacer(" ");
//Assert
        assertEquals("Enter valid input",result);
    }
}