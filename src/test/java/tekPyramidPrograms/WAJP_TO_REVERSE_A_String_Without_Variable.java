package tekPyramidPrograms;

public class WAJP_TO_REVERSE_A_String_Without_Variable {

	public static void main(String[] args) {
		
		String str="123456";
		
		char ch[]=str.toCharArray();
		
		for (int i=ch.length-1; i > 0; i--) {
			
			System.out.print(ch[i]);
		}
	}
}
