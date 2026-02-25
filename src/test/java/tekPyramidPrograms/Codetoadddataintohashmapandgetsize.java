package tekPyramidPrograms;

import java.util.HashMap;

public class Codetoadddataintohashmapandgetsize {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hs=new HashMap<String, Integer>();
		
		//for (int i = 0; i < hs.size(); i++) {
			
			hs.put("hai", 12);
			hs.put("hello", 12);
			
			System.out.println(hs);
			
			int count=hs.size();
		
			System.out.println(count);
	}
}
