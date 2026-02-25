package tekPyramidPrograms;

import org.testng.annotations.Test;

public class reverseAString {

	@Test
	public void reverseAword() {
		
		String str="new program";
		
		 String[] str1 = str.split(" ");
		 
		 String rev=" ";
		
		for (int i = 0; i < str1.length; i++) {
			
			rev=str1[i]+" "+rev;
		}
		System.out.println(rev);
	}
	
	@Test
	public void reverseString() {
		
		String str="new program";
		
		char ch[]=str.toCharArray();
		
		String rev="";
		
		for (int i = 0; i < ch.length; i++) {
			
			rev=ch[i]+rev;
		}
		System.out.println(rev);
	}
	
	@Test
	public void reverseStringwithoutVariable() {
		
		String str="new program";
		
		char ch[]=str.toCharArray();
		
		for (int i=ch.length-1;i>=0;i--) {
		
			System.out.println(ch[i]);
		}
		
	}
	
	@Test
	public void reverseStringUsingRecurssion() {
		
		String str="new program";
		
		char ch[]=str.toCharArray();
		
		reverseStringUsingRecurssion();
	}
	
}
