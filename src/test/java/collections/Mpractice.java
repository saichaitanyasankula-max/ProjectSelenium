package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class Mpractice {

	@Test
	public void map() {
		
		//creation of map 
		Map<Integer,String>	m=new Hashtable<Integer, String>();
		Map<Integer,String>	m1=new LinkedHashMap<Integer,String>();
		Map<Integer,String>	m2=new HashMap<Integer,String>();
		
		
		//Addition of elements into map
		m.put(500050, "Vijayawada");
		m.put(520061, "Hyderabad");
		m.put(789457, "Rajemundry");
		
		//Retreval keys form the map
		
		Set<Integer> keys = m.keySet();
		
		for ( Integer key : keys) {
			System.out.println(key);
		}
		
		System.out.println("=============");
		
		//retreval values from map
		Collection<String> val = m.values();
		
		for (String key: val) {
			System.out.println(key);
		}
		
		
		System.out.println("Before removing the elements"+m);
		
		//Deletion values from map
		m.remove(500050);
		
		System.out.println("After removeing the elements"+m);
		
		//retrival value from the map
		System.out.println("retriving data"+m.get(520061));
		
		System.out.println("=================");
		
		//getting key and value both at a time
		
		Set<Integer> keyss = m.keySet();
		
		for ( Integer key : keyss) {
			System.out.println(key+">>>>>>>>>>>>>"+m.get(key));
		}
		
		//verification of keys in map
		System.out.println(m.containsKey(500050));
		
		//verification of values in map
		System.out.println(m.containsValue("Hyderabad"));
		
		//if you want to upadte the map
		System.out.println("Before Updating"+m);
		m.put(500050, "AndhraPredesh");
		System.out.println("after updating"+m);
		
		//updating if it is absent
		
		m.putIfAbsent(500050, "Banglore");
		
		System.out.println("it is going to update the key is absent"+m);
		
		System.out.println("===========================");
		//For updating we can use the another method also
		System.out.println("Before Updating"+m);
		m.replace(789457, "kanur");
		System.out.println("After Updating"+m);
		
		System.out.println("=======================");
		
		//using Entry Set
		Set<Entry<Integer, String>> entry = m.entrySet();
		
		for (Entry<Integer, String> entries : entry) {
			
			Integer key = entries.getKey();
			
			String value = entries.getValue();
			
			System.out.println(key+">>>>>>>>>>>"+value);
			
		}
	}
}
