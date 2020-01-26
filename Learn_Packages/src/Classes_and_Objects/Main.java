package Classes_and_Objects;

public class Main {
public int radius;
public int x = 5;
Main (int x1, int x2) { //Κατασκευαστής
radius = x1;
x = x2 + 2;

}

public int x3 () {
	return radius;
	}

public int x4 (int x4) {
int newradius = radius + x4;
return newradius;
} //Μέθοδος

}
