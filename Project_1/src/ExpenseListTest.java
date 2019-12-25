import static org.junit.Assert.*;

import org.junit.Test;

public class ExpenseListTest {

	@Test
	public void test() {
	ExpenseList ex = new ExpenseList();
	ex.add(100.0);
	ex.add(200.0);
	assertEquals (300.0, ex.total(), 0);
	}

}
