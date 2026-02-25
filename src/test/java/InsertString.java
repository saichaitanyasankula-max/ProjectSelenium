import java.util.Iterator;

import org.testng.annotations.Test;

public class InsertString {

	@Test
	
	public void concatString() {
		
		String str="java is a language";
		
		String str1="simple";
		
		int pos=str.lastIndexOf("a");
		
		String result=str.substring(0, pos+1)+" "+str1+" "+str.substring(pos+1);
		
		System.out.println(result);
	}
	
	@Test
	
	public void concatString1() {
		
String str="java is a language";
		
		String str1="simple";
		
		int pos=str.lastIndexOf(" a");
		
		String result = str.replace("a ", "a "+str1+" ");
		
		System.out.println(result);
		
	}
	@Test
	
	public void concatString2() {
		
		String str="java is a language";
		
		String str1="simple";
		
		String temp=" ";
		
		String str2[]=str.split(" ");
		
		for (int i = 0; i < str2.length; i++) {
			
			if(i==2)
			{
				temp=temp+str1;
			}
			else
			{
				temp=temp+str2[i];
			}
		}
		System.out.println(temp);
	}
	
	@Test
	
	public void stringcount() {
		
		int a[]= {10,20,30};
		
		//char ch[]=str.toCharArray();
		
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
