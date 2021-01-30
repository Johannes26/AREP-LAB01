package edu.escuelaing.arep;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public Calculator calculator;
    
	public AppTest(){
		calculator = Calculator.getCalculator();
	}
	
	
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
