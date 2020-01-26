package Basics;

public class Test {
	 // Δηλώνει 2 μεταβλητές για τον χρήστη.

	    private String name;
	    private String telephone;
	   
	    /**
	     * Creates a new instance of Client
	     */
	    public Test (String name, String telephone) {
	        this.name = name;
	        this.telephone = telephone;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getTelephone() {
	        return telephone;
	    }
	    public String get(Test t) {
	    	t.getName();
	    	t.getTelephone();
	    	return t.getTelephone();
	    }
	}
