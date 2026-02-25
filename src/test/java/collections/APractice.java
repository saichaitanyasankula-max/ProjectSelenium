package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class APractice {

	public static void main(String[] args) {

		//Declaration
		
		ArrayList al=new ArrayList();
		
		//List l=new ArrayList();
		
		//ArrayList<String> al=new ArrayList<String>();
		
		al.add(25);
		al.add(100.0);
		al.add(true);
		al.add(25);
		al.add("sai");
		al.add(null);
		
		System.out.println("adding the elements"+al);
		
		System.out.println("------------------------");
		
		//size of arraylist
		System.out.println("size of an array"+"==>"+al.size());
		
		System.out.println("-------------------------");
		
		//remove the element from the arraylist
		
		System.out.println("removing the element"+"==>"+al.remove(1));
		
		System.out.println("-------------------------");
		
		//Inserting element in the middle
		
		al.add(3,false);
		
		System.out.println("inserting the element in the arraylist"+"==>"+al);
		
		System.out.println("-------------------------");
		
		//modifying the element in the arraylist
		
		al.set(2, false);
		
		System.out.println("modifying the element in the arraylist"+"==>"+al);
		
		System.out.println("-------------------------");
		
		//access the specific element in the arraylist
		
		System.out.println(al.get(1));
		
		System.out.println("-------------------------");
		
		//reading all the element form the arraylist
		
		// 1st approch using for loop
		
		for(int i=0;i<al.size();i++)
		{
		al.get(i);
		}
		System.out.println("using the for loop"+al);
		
		System.out.println("-------------------------");
		
		//2nd approch using for each loop
		
		for (Object list : al) {
			
			System.out.println("using foreach loop"+"==>"+list);
		}
		
		System.out.println("-------------------------");
		
		//3rd approch using iterator
		
		Iterator <Object> listit = al.iterator();
		
		//hasnext method which is going to check for element is present or not if it is present it is going to return true
		
		//next() which is going to get the element
		
		while(listit.hasNext())
		{
			System.out.println(listit.next());
		}
		
		System.out.println("-------------------------");
		
		//checking the arraylist is empty or not
		
		System.out.println("is empty or not"+al.isEmpty());
		
		//it is going to return the value as false
		
		System.out.println("-------------------------");
		
		//remove all the elements from the array list and multiple elements also
		
		ArrayList mylist=new ArrayList();
		
		mylist.add(25);
		mylist.add(100.0);
		
		al.removeAll(mylist);
		
		System.out.println("After removing the multiple elements"+al);
	}

}


