package tekPyramidPrograms;

public class String_Program_with_Constant_Space {

	public static void main(String[] args) {
		
		String str="My name is xyz";
		
		String str1 = str.replace(" ", "");
		
		int j=str1.length()-1;
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++)	
		{
			if(ch[i]!=' ') {
				
				System.out.print(str1.charAt(j--));
			}
			else
			{
				System.out.print(ch[i]);
			}
		}	
	}
}
