package Collection;
import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;

public class ArrayList4_1ExampleClass  implements Serializable {

private String a;
private int i;

public ArrayList4_1ExampleClass (String a, int i)  {
	this.a = a;
	this.i = i;
}

public String getA() {
	return a;
}
public void setA(String a) {
	this.a = a;
}
public int getI() {
	return i;
}
public void setI(int i) {
	this.i = i;
}
public String toString() {
	return "How Are You " + a + " " + i ;
}
}
