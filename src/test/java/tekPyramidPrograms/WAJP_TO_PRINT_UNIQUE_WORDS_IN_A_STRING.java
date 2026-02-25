package tekPyramidPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class WAJP_TO_PRINT_UNIQUE_WORDS_IN_A_STRING {

	public static void main(String[] args) {

		String str="this is the this sai";

		String st[]=str.split(" ");
		
		HashMap<String, Integer> hs=new HashMap<String, Integer>();

		for (int i = 0; i < st.length; i++) {

			if(hs.containsKey(st[i]))
			{
				hs.put(st[i], hs.get(st[i])+1);
			}
			else
			{
				hs.put(st[i], 1);
			}
		}
		for (Entry<String, Integer> c : hs.entrySet()) {

			if(c.getValue()==1)
			{
				System.out.println(c.getKey()+"---->"+c.getValue());
			}
		}
	}
}

