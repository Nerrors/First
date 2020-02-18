package PolymorphismAndDynamicBinding;

public class Student extends Person {

	private int studentNumber;
	
	public Student () {
		super();
		studentNumber = 0;
	}
	
	public Student (String initialname, int studentNumber) {
		super(initialname);
		this.studentNumber=studentNumber;
		
	}

	// Geters And Seters
	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	
	public String alex() {
		return getName() + studentNumber;
		
		// return " " + name + studentNumber;
		
		// Η name είναι μεταβλητή της κλάσης Person.
		// ***** Για να την χρησιμοποιήσουμε έτσι όπως έχει, θα πρέπει να είναι public και όχι private.
	}
}
