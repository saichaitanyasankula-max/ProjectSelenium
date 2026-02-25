package collections;

import java.util.*;

public class vpractice {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		//vector defautl capcity is 10 to know that we can use the capacity method();
		
		System.out.println(v.capacity());
		
		//adding elements
		
		v.add("x1");
		v.add("x2");
		v.add("x3");
		v.add("x4");
		
		System.out.println(v);
		//when ever we are adding the more than the default size of the 
		//element vector is going to increase 100% of its size
		
		System.out.println("size of the vector"+"---->"+v.size());
		System.out.println("capacity of the vector"+"---->"+v.capacity());
		
		Vector v2= new Vector();
		
		v2.add("y1");
		v2.add("y2");
		v2.addElement(v2);
		
		
		
/*
 * we can add the elements in four ways
 * add(object e)
 * add(int index,object element)
 * add all(Collection c)
 * add all(int index,collectin c)
 * add element(Object o)		
 */
		
		//one way of adding the element into another vector 
//		for (int i = 0; i < v2.size(); i++) {
			
//			v.add(v2.get(i));
	
//		}
		
		//And also we can use addall method
		
		v.addAll(v2);
		
		//addall(Collection c)
		//addall(index,Collection)
		
		System.out.println(v);
		
		
		v.addAll(0, v2);
		
		System.out.println("Using index"+v);
		
		//retrival data
		
		System.out.println("Retriving the data"+"----->"+v.get(0));
				
		System.out.println("============================");
		//removing the data
		
		System.out.println("Before Removing"+v);
		
		v.remove(1);
		
		System.out.println("============================");
		
		System.out.println("Removing Data By using index"+v);
		
		System.out.println(v.contains("x1"));
		
		System.out.println(v.containsAll(v2));
		
		
		
		
	}
}
