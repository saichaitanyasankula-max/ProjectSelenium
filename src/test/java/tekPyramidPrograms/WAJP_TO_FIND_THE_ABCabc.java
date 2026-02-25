package tekPyramidPrograms;

public class WAJP_TO_FIND_THE_ABCabc {

	public static void main(String[] args) {
		
		String str="ABCabc!@#$";
		
		char ch[]=str.toCharArray();
		
		String capital="";
		String small="";
		String special="";
		
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]>='A' && ch[i]<='Z')
			{
				capital=capital+ch[i];
			}
			else if(ch[i]>='a' && ch[i]<='z')
			{
				small=small+ch[i];
			}
			else
			{
				special=special+ch[i];
			}
		}
		System.out.println(capital);
		System.out.println(small);
		System.out.println(special);
	}
}
