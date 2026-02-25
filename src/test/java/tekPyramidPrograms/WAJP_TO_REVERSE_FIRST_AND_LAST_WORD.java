package tekPyramidPrograms;

public class WAJP_TO_REVERSE_FIRST_AND_LAST_WORD {

	public static void main(String[] args) {
		
		String str= "abc def ghi jkl";
		
		String[] str1=str.split(" ");
		
		
		for (int i = 0; i < str1.length; i++) {//i=0 abc
			
			if(i==str1.length-1 || i==str1.length-3)
			{
			
			char ch[]=str1[i].toCharArray();
			
			for(int j=ch.length-1;j>=0;j--)
			{
				System.out.print(ch[j]);
			}
		}
			else
			{
				System.out.print(str1[i]);
			}
			System.out.print(' ');
			}
	}
}
