package Project_2;

public class CallByReference {
	int data = 50;
	
	public void change (int data) {
		data = 60;
		
	}

	public static void main (String[] args) {
		CallByValue calls = new CallByValue();
		
		System.out.println(calls.data);
		calls.change(80);
		System.out.println(calls.data);
		
	}

	}

