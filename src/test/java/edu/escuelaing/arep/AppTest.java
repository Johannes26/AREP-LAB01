package edu.escuelaing.arep;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Assert;
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
    
    @Test
    public void deberiaCalcularElReultadoDeLaPrueba1(){
    	ArrayList<Double> result =calculator.Execute("./src/test/java/edu/escuelaing/arep/Prueba1");
        Assert.assertEquals(550.6,result.get(0),0.2);
        Assert.assertEquals(572.03,result.get(1),0.2);
    }
    @Test
    public void deberiaCalcularElReultadoDeLaPrueba2(){
    	ArrayList<Double> result =calculator.Execute("./src/test/java/edu/escuelaing/arep/Prueba2");
    	Assert.assertEquals(60.32,result.get(0),0.2);
        Assert.assertEquals(62.26,result.get(1),0.2);
    }
    @Test
    public void deberiaCalcularElReultadoDeLaPrueba3(){
    	ArrayList<Double> result =calculator.Execute("./src/test/java/edu/escuelaing/arep/Prueba3");
    	Assert.assertEquals(638.9,result.get(0),0.2);
        Assert.assertEquals(625.63,result.get(1),0.2);
    }
}
