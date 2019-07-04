package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest {
    RegularExpression regularExpression;
    @Before
    public void setUp()
    {
        regularExpression =new RegularExpression();
    }
    @After
    public void tearDown()
    {
        regularExpression =null;
    }
    @Test
    public void setRegularExpressionExample() {
        boolean result = regularExpression.ExpressionChecker("This is Harry", "Harry");
        assertEquals(true, result);
    }

    @Test
    public void ifgivenSequenceIsNotTherePrintErrMsg() {
        boolean result = regularExpression.ExpressionChecker("This is Harry", "Hello");
        assertEquals(false, result);
    }
    @Test
    public void inTheGivenInputStringPrintErrMsgIfStringIsNull(){
        boolean result=regularExpression.ExpressionChecker(null,"She sells seashells by the seashore");
        assertEquals(false,result);
    }
    @Test
    public void inTheGivenInputStringPrintErrMsgIfStringIsEmpty(){
        boolean result=regularExpression.ExpressionChecker(" "," ");
        assertEquals(false,result);
    }
}
