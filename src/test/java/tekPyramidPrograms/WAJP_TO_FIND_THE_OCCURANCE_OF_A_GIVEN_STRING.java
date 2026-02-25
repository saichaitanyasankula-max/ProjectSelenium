package tekPyramidPrograms;

import java.util.HashMap;
import java.util.Map.Entry;


public class WAJP_TO_FIND_THE_OCCURANCE_OF_A_GIVEN_STRING {

	public static void main(String[] args) {
		
		String str="sai chaitu";
		
		char ch[]=str.toCharArray();
		
		HashMap<Character, Integer> hs=new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			if(hs.containsKey(ch[i]))
			{
				hs.put(ch[i], hs.get(ch[i])+1);
			}
			else
			{
				hs.put(ch[i], 1);
			}
			
		}
		
for(Entry<Character, Integer> e:hs.entrySet())
		{
			if(e.getValue()>=1)
			{
				System.out.println(e.getKey()+"------>"+e.getValue());
			}
		}
	}
}
