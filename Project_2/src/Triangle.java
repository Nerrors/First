
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

public double getB() {
	return b;
}

public double getC() {
	return c;
}

public TriangleTypes get() {
	if(a<= 0 || b<= 0 || c<= 0){
		return TriangleTypes.NotValid;
		}

int sum= 0;

if(a== b)sum= sum+ 1;
if(a== c)sum= sum+ 2;
if(b== c)sum= sum+ 3;

if(sum== 0){ 
	if(a+b<= c|| b+c<= a|| a+c<= b)
		return TriangleTypes.NotValid;
	else
		return TriangleTypes.Scalene;
	}

if(sum> 3)
	return TriangleTypes.Equilateral;
else if(sum == 1 && a+b> c)
	return TriangleTypes.Isosceles;
else if(sum == 2 && a+c> b)
	return TriangleTypes.Isosceles;
else if(sum == 3 && b+c> a)
	return TriangleTypes.Isosceles;
		
return TriangleTypes.NotValid;
}

public double area() throws Exception {
	if (get() == TriangleTypes.NotValid) throw new Exception ("Not a valid triangle"); // Τα enum τα ελέγχουμε με == και όχι με equals.
	double s = (a+b+c) /2;
	return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}