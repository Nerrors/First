package PolymorphismAndDynamicBinding;

public class Person {

	private String name;
	//***** Μια private μεταβλητή μπορεί να μπεί σε μια public μέθοδο (για παράδειγμα, get και set μαθόδους).
	
	
	public Person() {
		name = "No name yet";
	}
	public Person(String name) {
		this.name=name; // Από την στιγμή που βάζουμε το this, σημαίνει ότι αναφερόμαστε σε Implicit παράμετρο.
	
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String alex() {	
		return name;
	}	
}
