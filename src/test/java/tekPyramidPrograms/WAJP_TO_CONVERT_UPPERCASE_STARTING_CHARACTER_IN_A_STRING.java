package tekPyramidPrograms;

public class WAJP_TO_CONVERT_UPPERCASE_STARTING_CHARACTER_IN_A_STRING {

	public static void main(String[] args) {
		
		String str="hi this is tekpyramid";
		
		String[] str1 = str.split(" ");
		
		for (int i = 0; i < str1.length; i++) {
			
			char[] ch = str1[i].toCharArray();
			
			String result="";
			
			for (int j = 0; j < ch.length; j++) {
				
				if(j==0)
				{
					result=ch[j]+result;
					
					String finalword = result.toUpperCase();
					
					System.out.print(finalword);
				}
				else
				{
					System.out.print(ch[j]);
				}
			}
			
			System.out.println();
		}
	}
}
