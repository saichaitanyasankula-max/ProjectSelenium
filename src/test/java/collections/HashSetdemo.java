package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetdemo {

	public static void main(String[] args) {
		
		//Declaration
		
		HashSet hash=new HashSet();
		
		//Set myset=new java.util.HashSet();
		
		//java.util.HashSet hs=new java.util.HashSet();
		
		hash.add(100);
		hash.add(true);
		hash.add("welcome");
		hash.add('c');
		hash.add(false);
		hash.add(100);
		hash.add(null);
		hash.add(null);
		
		System.out.println(hash);
		
		System.out.println("-----------------");
		
		//removing the element from the hash set
		
		hash.remove(100); // removeing the value because in hashset there is no indexing
		
		System.out.println("after removing the value"+"==>"+hash);
		
		System.out.println("--------------------");
		
		//size of the hashset
		
		System.out.println(hash.size());
		
		System.out.println("--------------------");
		
		//inserting element is not possible in the set collection because there is no indexing 
		
		//accessing element is not possible in the set directly 
		
		//Convert hashset to the arraylist
		
		ArrayList al = new ArrayList(hash);
		
		System.out.println(al.get(2));
		
		System.out.println("--------------------");
		
		//read all the elements using foreach loop
		
		for (Object var : hash) {
			
			System.out.println("reading the data by using for each loop"+var);
		}
		
		System.out.println("--------------------");
		
		//read all the elements by using iterator
		
		Iterator ite = hash.iterator();
		
		while(ite.hasNext()) {
			
			System.out.println("By using the iterator"+"==>"+ite.next());
		}
		
		System.out.println("--------------------");
		
		//clearing all the elements in hasset
		
		hash.clear();
		
		System.out.println(hash.isEmpty());
	}
}
