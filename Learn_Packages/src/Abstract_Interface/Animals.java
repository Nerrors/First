package Abstract_Interface;

public abstract class  Animals {
protected int food;
protected int drink;
public static int g = 20;

protected String r = "Test";

public Animals (int food, int drink) {
	this.food = food;
	this.drink=drink;
}

public abstract void food(int amount);
public abstract void drink(int amount);

public String a() {
	return r;
} //  ’ρα μπορούμε να χρησιμοποιήσουμε κια τέτοιες μεθόδους που δεν χρειάζονται υλοποίηση από την κλάση που την υλοποιεί.


public String toString() {
	return  food + "" + drink;
}
}
