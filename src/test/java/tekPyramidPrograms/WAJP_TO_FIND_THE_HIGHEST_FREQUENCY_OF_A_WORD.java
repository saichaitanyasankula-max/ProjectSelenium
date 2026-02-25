package tekPyramidPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class WAJP_TO_FIND_THE_HIGHEST_FREQUENCY_OF_A_WORD {

	public static void main(String[] args) {
		
		String hf="hello world world hello world hello hello";
	
		String[] str = hf.split(" ");
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		for(int i=0;i<str.length;i++)
		{
			if(map.containsKey(str[i]))
			{
				map.put(str[i],map.get(str[i])+1);
			}
			else
			{
				map.put(str[i], 1);
			}
		}
		
		int max=0;
		
		String highestfrequency="";
		
		for (Entry<String, Integer> k : map.entrySet()) {
			
			if(k.getValue()>max)
			{
				highestfrequency =k.getKey();
				max=k.getValue();
			}
		}
		
		System.out.println(highestfrequency+" "+max);
	}
}
