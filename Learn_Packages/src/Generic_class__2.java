import Basics.StringMethods;

public class Generic_class__2 {
Generic_class f;
public Generic_class__2 (Generic_class f) {
	this.f = f;
}
public Generic_class getF() {
	return f;
}
public void setF(Generic_class f) {
	this.f = f;
}
public StringMethods toString() {
	return "Το f είναι" + f.getA();
}
public static void main (StringMethods [] args) {
	Generic_class t = new Generic_class(30);
	Generic_class__2 r = new Generic_class__2 (t);
	System.out.println(r);
}
}
