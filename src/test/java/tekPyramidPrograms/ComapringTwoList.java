package tekPyramidPrograms;

import java.util.ArrayList;
import java.util.HashMap;

public class ComapringTwoList {

	public static void main(String[] args) {
		
		ArrayList<String> ar= new ArrayList<String>();
		
		ar.add("abc");
		ar.add("def");
		ar.add("ghi");
		
		ArrayList<String> ar1= new ArrayList<String>();
		
		ar1.add("bc");
		ar1.add("def");
		ar1.add("hi");
		
		HashMap<String, Boolean> hs=new HashMap<String, Boolean>();
		
		for (String string : ar) {
			
			if(ar1.contains(string))
			{
				hs.put(string, true);
			}
			else
			{
				hs.put(string, false);
			}
		}
		System.out.println(hs);
		
	}
}
