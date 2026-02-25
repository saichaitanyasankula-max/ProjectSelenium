package tekPyramidPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class WAJP_TO_FIND_THE_OCCURANCE_OF_THE_GIVEN_STRING_USING_HASH_MAP {

	public static void main(String[] args) {
		
		String str="working in tekpyramid";
		
		//char ch[]=str.toCharArray();
		
		String []ch=str.split(" ");		
		HashMap<String, Integer> hs=new HashMap<String, Integer>();

		for (int i = 0; i < ch.length; i++) {

			if(hs.containsKey(ch[i]))
			{
				hs.put(ch[i], hs.get(ch[i])+1);
			}
			else
			{
				hs.put(ch[i], 1);
			}
		}
		
		for (Entry<String, Integer> c : hs.entrySet()) {
			
			if(c.getValue()==1)
			{
				System.out.println(c.getKey()+"--->"+c.getValue());
			}
		}
		

//		for (Entry<Character, Integer> c : hs.entrySet()) {
//
//			if(c.getValue()==1)
//			{
//				System.out.println(c.getKey()+"---->"+c.getValue());
//			}
//		}
	}
}
