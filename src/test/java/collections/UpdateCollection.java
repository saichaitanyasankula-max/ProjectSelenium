package collections;

import java.util.Vector;

public class UpdateCollection {

	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		
		v1.add("ravi");
		v1.add("Shankar");
		v1.add("Shivaji");
		v1.add("ramya");
		v1.add("Chekori");
		
		System.out.println("Before updating the collection"+v1);
		
		//Upadate collection
		v1.set(3, "chandra");
		
		System.out.println("=======================");
		
		System.out.println("After updating the collection"+v1);
		
		
		
	}
}
