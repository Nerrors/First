package Junitpackageexmaple;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testTringletype() {
		Triangle tt = new Triangle (20.0,20.0,20.0);
		TriangleType ttype = tt.tringletype();
		assertEquals (TriangleType.Isosceles,ttype,0);
	}

	@Test
	public void testArea() {
		fail("Not yet implemented");
	}

}
