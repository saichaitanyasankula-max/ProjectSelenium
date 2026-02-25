package tekPyramidPrograms;
import java.util.Arrays;

public class WAJP_TO_FIND_WEATHER_IT_IS_ANAGRAM_OR_NOT {

	public static void main(String[] args) {
		
		String str="thing";
		
		String str1="night";
		
		char [] s=str.toCharArray();
		
		char[] s1 = str1.toCharArray();
		
		Arrays.sort(s);
		Arrays.sort(s1);
		
		System.out.println(s);
		
		System.out.println(s1);
		
		for (int i = 0; i < s.length; i++) {
			
			if(s[i]!=s1[i])
			{
				System.out.println("it is not an anagram");
			}
			else
			{
				System.out.println("it is an anagram");
			}
		}
				
//		boolean b=Arrays.equals(s, s1);
//		
//		System.out.println(s);
//		System.out.println(s1);
//		
//		if(b==true)
//		{
//			System.out.println("it is an anagram");
//		}
//		else
//		{
//			System.out.println("it is not an anagram");
//		}
	}
}
