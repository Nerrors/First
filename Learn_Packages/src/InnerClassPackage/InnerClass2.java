package InnerClassPackage;

public class InnerClass2 {
		   
		   private int num = 175;    // private variable of the outer class
		   
public class Inner_Demo {  // inner class
	
		   public int getNum() {
		     
		    	  num = 500;
		    	  System.out.println("This is the getnum method of the inner class");
		    	  return num;
		      }
		   }
		}