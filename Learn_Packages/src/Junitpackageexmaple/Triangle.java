package Junitpackageexmaple;

public class Triangle {
	
	private double a;
	private double b;
	private double c;

public Triangle (double a, double b, double c) {
	this.a=a;
	this.b=b;
	this.c=c;
}

public double getA() {
	return a;
}

public void setA(double a) {
	this.a = a;
}

public double getB() {
	return b;
}

public void setB(double b) {
	this.b = b;
}

public double getC() {
	return c;
}

public void setC(double c) {
	this.c = c;
}

public TriangleType tringletype() {
	if (a<=0 || b<=0 | c<=0)
		return TriangleType.NotValid;
	int sum=0;
	if (a==b) sum+=1;
	if (a==c) sum+=2;
	if (b==c) sum+=3;
	
	if (sum==0) {
		
		if (a+b <= c || b+c<=a || a+c<=b)
			return TriangleType.NotValid;
		else
			return TriangleType.Scalene;
	}
	
	if (sum > 3)
		return TriangleType.Equilateral;
	else if (sum == 1 && a+b > c)
		return TriangleType.Isosceles;
	else if (sum == 2 && a+c > b)
		return TriangleType.Isosceles;
	else if (sum == 3 && b+c > a)
		return TriangleType.Isosceles;
	else
		return TriangleType.NotValid;
}


public double area() throws Exception {
	if (tringletype() == TriangleType.NotValid)
		throw new Exception ("Not a valid Triangle");
	double s = (a+b+c) /2;
	return Math.sqrt(s*(s-a) * (s-b) * (s-c));
	}
}
