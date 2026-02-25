package tekPyramidPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class maxwordinastring {

	public static void main(String[] args) {
		
		String str="dad mom dad mom mom ";
		
		String str1="dad mom dad mom dad";
		
		String combined=str+""+str1;
		
		String[] ac = combined.split(" ");
		
		HashMap<String, Integer> word=new HashMap<String, Integer>();
		
		for (int i = 0; i < ac.length; i++) {
		
			if(word.containsKey(ac[i]))
			{
				word.put(ac[i], word.get(ac[i])+1);
			}
			else
			{
				word.put(ac[i], 1);
			}
		}
		
		String mostrepeatedword=null;
		int maxcount=0;
		
		for (Entry<String, Integer> e : word.entrySet()) {
			
			if(e.getValue()>=maxcount)
			{
				maxcount=e.getValue();
				mostrepeatedword=e.getKey();
			}
		}
		System.out.println(mostrepeatedword+"====>"+maxcount);
	}
}
