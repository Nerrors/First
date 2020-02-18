package InnerClassPackage;

public class InnerClass2Main {
	public static void main(String[] args) {
		
		InnerClass2 inner2 = new InnerClass2();
	
		InnerClass2.Inner_Demo inner3 = inner2.new Inner_Demo();
		System.out.println(inner3.getNum());
		
	}
}
