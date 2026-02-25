package tekPyramidPrograms;

public class WAJP_TO_REVERSE_A_String_With_Variable {

	public static void main(String[] args) {
		
		String str="i am a software engineer";
		
		String rev=" ";
		
		char ch[]=str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			rev=ch[i]+rev;
		}
		System.out.println(rev);
	}
}
