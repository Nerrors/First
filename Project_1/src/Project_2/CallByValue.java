package Project_2;

public class CallByValue {

	int data = 50;
	
public void change (CallByValue cbv) {
	cbv.data = 60;
	
}

public static void main (String[] args) {
	CallByValue call = new CallByValue();
	
	System.out.println(call.data);
	call.change(call); // Δημιούργησα το στιγμιότυπο, για αυτό δεν μου βγάζει error για non-stati
	System.out.println(call.data);
	
}

}
