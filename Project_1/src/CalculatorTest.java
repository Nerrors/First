import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith (value = Parameterized.class)
public class CalculatorTest {
	
	private int expected;
	private int valueone;
	private int valuetwo;
	
	//*****
	@Parameters
	public static Collection<Integer[]> getTest() {
		Collection<Integer[]> col = Arrays.asList(new Integer[][] { {2,1,1}, {4,3,1}, {5,4,1}});
		return col; }
	
	// Η asList() επιστρέψει μια fixed-size list που υποστηρίζεται από τον καθορισμένο πίνακα.
	
	/* Για παράδειγμα:
	
	Integer name0[] = {10, 20, 30, 40}; 
	List<Integer> list = Arrays.asList(name0);
	System.out.println(list);
	
	*/
	//*****
	
	public CalculatorTest (int expected, int valueone, int valuetwo) {
		this.expected = expected;
		this.valueone = valueone;
		this.valuetwo = valuetwo;
	}
	
	@Test
	// Η μέθοδος ελέγχου testAdd καλείται κάθε φορά μετά την κλήση του κατασκευαστή
	public void testAdd() {
	Calculator cal = new Calculator();
	double result = cal.add(valueone,valuetwo);
	assertEquals(expected, result, 0);
	}
}

/*

Η κλάση θα πρέπει να ξεκινάει με την επισήμανση @@RunWith(value = Parameterized.class).

Η εκτέλεση της κλάσης ελέγχου έχει ως αποτέλεσμα την 
εκτέλεση όλων των μεθόδων που έχουν επισημανθεί με την επισήμανση ‘@Test’.

*/
