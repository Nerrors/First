package Junitpackageexmaple;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith (value = Parameterized.class)
public class Calculator2Test {

	private double result;
	private double valueOne;
	private double valueTwo;
	
	public Calculator2Test (double result, double valueOne, double valueTwo) {
		this.result = result;
		this.valueOne= valueOne;
		this.valueTwo = valueTwo;
	}
	
	@Parameters
	public static Collection <Integer[]> getPar() {
		Integer [][] array2d =  { {4, 2, 2}, {5, 3, 2}, {10, 5, 5}, {6, 3, 3}  };
		return Arrays.asList(array2d);
	}
	
	@Test
	public void testSum() {
		Calculator2 cal2 = new Calculator2();
		assertEquals(result, cal2.sum(valueOne, valueTwo), 0);	
	}
}
