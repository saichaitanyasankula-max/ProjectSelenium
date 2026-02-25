package collections;

import java.util.Arrays;
import java.util.Vector;

public class indexingCollection {

	public static void main(String[] args) {
		
		Vector v1=new Vector();
		
		v1.add("chicken Wings");
		v1.add("burger");
		v1.add("French Fries");
		v1.add("chicken wings");
		
		//To get the index of the element
		System.out.println(v1.indexOf("French Fries"));
	
		//To get the index of lastElement
		System.out.println(v1.lastIndexOf("chicken wings"));
		
		//if we want to convert the vector into array and keep it a side 
		
		Object[] arr = v1.toArray();
		
		System.out.println("if you are printing the array directly"+"----->"+arr);
		
		System.out.println("================================================================");
		String e = Arrays.toString(arr);
		
		System.out.println("After converting Arrays.toString()"+"----->"+e);
		
		//converting array to vector list
		
		Object[] obj=new Object[] {1,2,3,4,5};
		
		Vector v2= new Vector(Arrays.asList(obj));
		
		System.out.println("================================================================");
		
		System.out.println(v2);
		
		System.out.println("================================================================");
		
		System.out.println("capacity of vector"+v2.capacity());
		
		System.out.println("================================================================");
		
		System.out.println("size of vector"+v2.size());
		
		/*
		 * When ever we are creating the vector the default capacity is 10 but when ever we are converting array to list 
		 * the size and capacity of the element is going to be same
		 */
		
		
		
	}
}
