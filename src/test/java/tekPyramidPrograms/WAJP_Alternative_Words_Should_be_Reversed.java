package tekPyramidPrograms;

public class WAJP_Alternative_Words_Should_be_Reversed {

	public static void main(String[] args) {
		
		String str="my name is xyz";
		
		String str1[]=str.split(" ");
		
		for(int i=0;i<str1.length;i++)
		{
		
		if(i%2==0) {
			
			char ch[]=str1[i].toCharArray();
			
			for (int j = ch.length-1; j>=0; j--) {
				
				System.out.print(ch[j]);
			}
		}
		else
		{
			System.out.print(str1[i]);
		}
		System.out.println();
		}
		
	}
}
