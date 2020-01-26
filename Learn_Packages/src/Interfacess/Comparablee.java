package Interfacess;

import java.util.ArrayList;
import java.util.Collections;

public class Comparablee implements Comparable<Comparablee> {
	
	int number;
	String name;
	int age;

public Comparablee (int number, String name, int age) {
	
	this.number=number;
	this.name=name;
	this.age=age;
}

//generate Getters And Setters.

public int compareTo (Comparablee o) {
	
	if (number == o.number) 
		return 0;
		else if (number>o.number) {
			return 1;
		}
		else 
			return -1;	
}

public static void main (String[] args) {
	
	ArrayList<Comparablee> al = new ArrayList<>();

	al.add(new Comparablee(101, "String1", 23));
	al.add(new Comparablee(106, "String2", 27));
	al.add(new Comparablee(105, "String3", 21));

	Collections.sort(al);
	
	for (Comparablee com: al) {
		System.out.println(com);
		
	}
}

}

/*

public class AnotherClass {

public static void main (String[] args) {

ArrayList<Student> al = new ArrayList<>();

al.add(new Student(101, "String1", 23));
al.add(new Student(106, "String2", 27));
al.add(new Student(105, "String3", 21));

Collections.sort(al);

for (Student std: al) {

System.out.println (st.)
}

}

}


*/
