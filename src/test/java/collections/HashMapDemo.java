package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaration
		//HashMap map=new HashMap();
		//Map map=new HashMap();
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		//adding pairs
		
		map.put(101, "Ravi");
		map.put(102, "indra");
		map.put(103, "raghu");
		map.put(104, "veera");
		map.put(102, "tarak");
		
		System.out.println(map);
		
		System.out.println("---------------------");
		
		//Size of the hashmap
		
		System.out.println("size of the map"+"==>"+map.size());
		
		System.out.println("----------------------");
		
		//remove pair
		
		map.remove(103);
		
		System.out.println("After removing the pair"+"===>"+map);
	
		//access the value of the key
		
		System.out.println("----------------------");
		
		System.out.println(map.get(104)); //it is going to get the value
		
		System.out.println("----------------------");
		
		//get all the keys from hashmap
		
		System.out.println("all the keys"+"==>"+map.keySet());// which is going to get all the keys  //[101, 102, 104]
		
		//get all the keys from hashmap
		
		System.out.println("----------------------");
		
		System.out.println("all the values"+"==>"+map.values());//which is going to get all the values //[Ravi, tarak, veera]

		System.out.println("----------------------");
		
		//get the keys and values at a time
		
		System.out.println("all the keys and values"+map.entrySet());
		
		System.out.println("----------------------");
		
		//Using foreach loop
		
		for (int s : map.keySet()) {
			
			System.out.println(s+"     "+map.get(s));
			
		}
		
		System.out.println("----------------------");
		
		//Using Iterator
		
		Iterator<Entry<Integer, String>> it = map.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry<Integer, String> entry = it.next();
			
			System.out.println(entry.getKey()+""+entry.getValue());
			
			//System.out.println(it.next());
		}
		
	}
}
