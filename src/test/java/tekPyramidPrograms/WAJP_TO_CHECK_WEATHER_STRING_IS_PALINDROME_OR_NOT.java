package tekPyramidPrograms;

public class WAJP_TO_CHECK_WEATHER_STRING_IS_PALINDROME_OR_NOT {

	public static void main(String[] args) {
		
		String str="sas";
		
		String str1="";
		
		char ch[]=str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			str1=ch[i]+str1;
		}
		
		if(str1.equalsIgnoreCase(str))
		{
			System.out.println("it is a palindrome String");
		}
		else
		{
			System.out.println("it is not a palindrome String");
		}
	}
}
