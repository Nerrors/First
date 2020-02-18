package Basics;

public class Call_By_ReferenceClass {
	int a = 20;

	public void change (Call_By_ReferenceClass op) {
		op.a += 20;
	}
	
	
	public static void main(String[] args) {
		Call_By_ReferenceClass call = new Call_By_ReferenceClass();
		System.out.println (call.a);
		call.a = 80;
		call.change(call);
		System.out.println (call.a);
	}
}