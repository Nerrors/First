package Inheritance;

public class Undergraduate_extends_Student extends Student_extend_Person {
private int level;
public Undergraduate_extends_Student () {
	super ();
	level = 1;
	
}
public Undergraduate_extends_Student (String initialName, int initialStudentNumber, int initialLevel) {
	super (initialName,initialStudentNumber);
	setLevel (initialLevel);
	
}
public int getLevel() {
	return level;
}
public void setLevel(int newLevel) {
	if ((1 <= newLevel) && (newLevel >= 4)) {
		level = newLevel;
	}
	else
	{
		System.out.println("Illegal Level");
		System.exit(0);
	}
}

public void writeOutput () {
	super.writeOutput(); // Κάνουμε κλήση μια επικαλυπτόμμενης μεθόδου του άμεσου μόνο γονέα.
	System.out.println("Student Level = " + level);
}
}
