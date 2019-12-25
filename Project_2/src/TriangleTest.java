import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class TriangleTest {
	
	@Parameters
	// Δεν λειτουργεί με αυτόν τον τρόπο.
	public static Collection<TriangleTypes[]> getTestParameters() {
		
		Triangle tr = new Triangle(20.0,20.0,20.0);
		Triangle tr2 = new Triangle(40.0,40.0,40.0);
		
		Collection<TriangleTypes[]> col = Arrays.asList(new TriangleTypes[][] { 
			{TriangleTypes.Equilateral, tr.get()}, 
			{TriangleTypes.Equilateral, tr2.get() }
			});
		return 	col;
		
	}

	@Test
	public void test() {
		Triangle tr = new Triangle(20.0,20.0,20.0);
		TriangleTypes result = tr.get();
		assertEquals(TriangleTypes.Equilateral, result); // Δεν χρειάζεται το 0.
	}

}
