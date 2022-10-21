package com.methodindustries.problems;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FizzBuzzTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void multipleOfThreeShouldReturnFizz()
    {
    	assertEquals(FizzBuzz.fizz(1), false);
    	assertEquals(FizzBuzz.fizz(2), false);
        assertEquals(FizzBuzz.fizz(3), true );
    }
    @Test
    public void multipleOfFiveShouldReturnBuzz()
    {
    	assertEquals(FizzBuzz.buzz(1), false);
    	assertEquals(FizzBuzz.buzz(2), false);
    	assertEquals(FizzBuzz.buzz(3), false);
    	assertEquals(FizzBuzz.buzz(4), false);
        assertEquals(FizzBuzz.buzz(5), true );
    }
    @Test
    public void calculateShouldReturnCorrectString()
    {
    	FizzBuzz FizzBuzz = new FizzBuzz();
    	assertEquals(FizzBuzz.calculate(0),"FizzBuzz");
    	assertEquals(FizzBuzz.calculate(4),"4");
    	assertEquals(FizzBuzz.calculate(3),"Fizz");
    	assertEquals(FizzBuzz.calculate(10),"Buzz");
    	assertEquals(FizzBuzz.calculate(15),"FizzBuzz");

    }
}


