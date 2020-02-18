package InnerClassPackage;

public class InnerClass4Main {
	
	public static void main(String[] args) {
		
		/* Αυτό μπορούμε να το κάνουμε.
		
		InnerClass4 inn = new InnerClass4();
		inn.b = 50;
		
		*/
		
		InnerClass4.Nested_Demo outin = new InnerClass4.Nested_Demo();
		outin. my_method();
	}
}
