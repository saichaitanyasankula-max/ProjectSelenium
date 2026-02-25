package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetPractice {

	public static void main(String args[])
	{
		//Hashset ->HashMap -> Array of Nodes(key,value)
		
		//Set<Integer> se=new HashSet();
		
		//new Object(); dummy object
		
		HashSet<Integer> hs=new HashSet();
		
		hs.add(25);
		hs.add(32);
		hs.add(98);
		hs.add(21);
		hs.add(32);
		hs.add(89);
		hs.add(63);
		
		System.out.println(hs);
		
		//removing element
		System.out.println(hs.remove(25));
		//contains
		System.out.println(hs.contains(890));
		
		for (Integer ele : hs) {
			
			System.out.println(ele);
			
		}
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet();
		
		lhs.add(25);
		lhs.add(32);
		lhs.add(98);
		lhs.add(21);
		lhs.add(32);
		lhs.add(89);
		lhs.add(63);
		
		System.out.println(lhs);
	}
}
