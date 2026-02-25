package tekPyramidPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class WAJP_TO_CHECK_WHICH_STRING_IS_HAVING_MAXIMUM_CHARACTERS {

	public static void main(String[] args) {
		
		String str="aabbbccccdddd";
		
		String str1="aaaabbbbbbccccccddddddd";
		
		char[] ch=str.toCharArray();
		
		char[] ch1=str1.toCharArray();
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for (int i = 0; i < ch.length; i++) {
			
			if(map.containsKey(ch[i]))
			{
				map.put(ch[i], map.get(ch[i])+1);
			}
			else
			{
				map.put(ch[i], 1);
			}
		}
		
		char char1=' ';
		int maxcount=0;
		
		for (Entry<Character, Integer> e : map.entrySet()) {
			
			if(e.getValue()>maxcount)
			{
				maxcount=e.getValue();
				char1=e.getKey();
			}
		}
		//System.out.println(char1+""+maxcount);
		
		System.out.println("=============================");
		
		HashMap<Character, Integer> map1=new HashMap<Character, Integer>();
		
		for (int i = 0; i < ch1.length; i++) {
			
			if(map1.containsKey(ch1[i]))
			{
				map1.put(ch1[i], map.get(ch1[i])+1);
			}
			else
			{
				map1.put(ch1[i], 1);
			}
		}
		char ch2=' ';
		int maxcount1=0;
		
		for (Entry<Character, Integer> e1 : map1.entrySet()) {
			
			if(e1.getValue()>maxcount1)
			{
				maxcount1=e1.getValue();
				ch2=e1.getKey();
			}
		}
		
		//System.out.println(ch2+""+maxcount1);
		
		
		int count=0;
		
		if(maxcount>maxcount1)
		{
			System.out.println(maxcount);
		}
		else
		{
			System.out.println(maxcount1);
		}
	}
}
