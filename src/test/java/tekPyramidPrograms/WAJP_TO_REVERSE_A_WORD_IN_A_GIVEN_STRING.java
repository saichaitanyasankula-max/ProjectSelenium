package tekPyramidPrograms;

import java.util.Iterator;

public class WAJP_TO_REVERSE_A_WORD_IN_A_GIVEN_STRING {

	public static void main(String[] args) {
		
		String str="Working as automation engineer";
		
		String st[]=str.split(" ");
		
		for (int i = 0; i < st.length; i++) {
			
			char ch[]=st[i].toCharArray();
			
			String rev=" ";
			
			for (int j = 0; j < ch.length; j++) {
				
				rev=ch[j]+rev;
				
			}
			
			System.out.print(rev+" ");
		}
	}
}
