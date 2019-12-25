import java.util.ArrayList;

public class ExpenseList {
private ArrayList<Double> expenselist;

// Στον κατασκευαστή δημιουργούμε το στιγμιότυπο ArrayList.

public ExpenseList() {
	expenselist = new ArrayList<>();
}

// Δημιουργούμε μια μέθοδος για να προσθέτει στοιχεία στην λίστα.

public void add (Double mount) {
	expenselist.add(mount);
}

// Δημιουργούμε μια μέθοδος

public double total() {
	double total = 0;
	Calculator cal = new Calculator();
	for (Double d : expenselist) {
		total = cal.add(total, d);
		
	}
	return total;
}

}
