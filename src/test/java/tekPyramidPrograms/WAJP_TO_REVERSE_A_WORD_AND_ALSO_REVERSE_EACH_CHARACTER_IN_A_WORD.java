package tekPyramidPrograms;

public class WAJP_TO_REVERSE_A_WORD_AND_ALSO_REVERSE_EACH_CHARACTER_IN_A_WORD {

	public static void main(String[] args) {
		
		String str="ravi chaitanya indra";
		
		String[] str1=str.split(" ");
		
		for (String string : str1) {
			
			String rev=" ";
			
			rev=" "+string+rev;
		
		//System.out.print(" "+rev);
		
		System.out.println(" ");
		
		char ch[]=rev.toCharArray();
		
		for (int i =ch.length-1; i>=0 ; i--) {
			
			System.out.print(ch[i]);
		}
	}
}
}
