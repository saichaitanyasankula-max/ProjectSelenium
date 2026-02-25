package tekPyramidPrograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String args[])
	{
		String s1="eat";
		String s2="ate";

		char[] ch1 = s1.toCharArray();

		char[] ch2 = s2.toCharArray();

		Arrays.sort(ch1);
		
		Arrays.sort(ch2);
		
		System.out.println(ch1);
	
		System.out.println(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("it is a palindrome");
		}
		else
		{
			System.out.println("it is not a palindrome");
		}
	}
}

