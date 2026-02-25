package tekPyramidPrograms;

import java.util.TreeSet;

public class WAJP_TO_PRINT_THE_ARRAY_IN_ASCENDING_ORDER {
	
	public static void main(String[] args) {
		
	String str[]= {"b","c","a"};
	
	TreeSet<String> ts=new TreeSet<String>();
	
	for (int i = 0; i < str.length; i++) {
		
		ts.add(str[i]);
	}
	
	System.out.println(ts);
	
	}

}
