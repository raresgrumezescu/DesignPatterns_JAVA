package laborator13;

import java.util.*;

public class Catalog {

    private static Catalog obj = null;
    ArrayList<Course> courses;
    
    private Catalog() {
        // do stuff
        System.out.println("Instantiam!");
    }

    public static Catalog getInstance() {
        if (obj == null)
            obj = new Catalog(); 
        return obj;
    }
    
    public String toString() {
    	String string = "";
    	for (Course c : courses) {
    		string = string + c.name + " : \n" + c.toString();
    	}
    	return string;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
