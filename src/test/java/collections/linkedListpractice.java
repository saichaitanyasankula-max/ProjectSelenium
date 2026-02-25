package collections;

import java.util.*;

public class linkedListpractice {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		
		ArrayList<String> st= new ArrayList<String>();
		
		st.add("ram");
		
		st.add("rudra");
		
		st.add("indra");
		
//		List li=new LinkedList();
//		
//		Queue q=new LinkedList();
//		
//		Deque de=new LinkedList();
		
		//adding the elements into the linked list
		ll.add("lav");
		
		ll.add("an");
		
		ll.add("ya");
		
		System.out.println(ll);
		
		//adding list into linked list
		
		ll.addAll(st);
		
		System.out.println(ll);
		
		//remove the element
		ll.remove("an");
		
		System.out.println("after removing the element"+ll);
		
		//validation the element
		
		boolean ele = ll.contains("an");
		
		System.out.println("validating the element"+ele);
		
		//updation of the element
		ll.set(0, "oiuy");
		System.out.println(ll);
		
		
	}
}
