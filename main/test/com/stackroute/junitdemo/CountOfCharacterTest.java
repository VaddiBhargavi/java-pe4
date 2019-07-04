package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountOfCharacterTest {
        CountOfCharacter countOfCharacter;
        @Before
        public void setUp(){
            countOfCharacter=new CountOfCharacter();
        }
        @After
        public void tearDown(){
            countOfCharacter=null;
        }
        @Test
        public void givenStringShouldPrintCountOfGivenCharacter() {
//Arrange
//Act
            String result = countOfCharacter.characterChecker("Bhargavi",'a');
//Assert
            assertEquals("Count of given character in a string=2", result);
            assertNotNull(countOfCharacter.characterChecker("bhargavi", 'a'));
        }
    @Test
    public void ifGivenStringIsNullShouldPrintError() {
//Arrange
//Act
        String result = countOfCharacter.characterChecker(null,'a');
//Assert
        assertEquals("Enter valid input", result);
    }
    @Test
    public void ifGivenStringAndCharacterIsNullShouldPrintError() {
//Arrange
//Act
        String result = countOfCharacter.characterChecker(" ",' ');
//Assert
        assertEquals("Enter valid input",result);
    }
    @Test
    public void ifGivenCharacterIsNullShouldPrintError() {
//Arrange
//Act
        String result = countOfCharacter.characterChecker("Bhargavi",' ');
//Assert
        assertEquals("Enter valid input",result);
    }
}