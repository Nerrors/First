package Basics;

import java.util.Random;

public class RandomClass {
	public static void main(String[] args) {
		Random numbers = new Random();
		int n = numbers.nextInt(49) + 1; // Όπως και το Scanner in ...in.nextInt();
		System.out.println(n);
	}
}

// ’λλοι τρόποι (χωρίς την χρήση της κλάσης Random) είναι οι εξής:

/*

double random = Math.random() * 49 + 1;
ή
int random = (int) (Math.random() * 50 + 1);

*/