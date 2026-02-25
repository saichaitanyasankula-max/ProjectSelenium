package tekPyramidPrograms;

public class WAJP_TO_PRINT_THE_SPECIALCHARACTER_CAPITAL_SMALL_SEPERATELY {

	public static void main(String[] args) {
		
		String str="ABC!@#$abc";
		
		char ch[]=str.toCharArray();
		
		String capital=" ";
		String small=" ";
		String special=" ";
		
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]>='A' & ch[i]<='Z')
			{
				capital=ch[i]+capital;

			}
			else if(ch[i]>='a' & ch[i]<='z')
			{
				small=ch[i]+small;
			
			}
			else
			{
				special=ch[i]+special;
				
			}
		}
		
		System.out.println(capital);
		System.out.println(small);
		System.out.println(special);
		
	}
}
