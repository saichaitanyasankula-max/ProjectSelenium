package tekPyramidPrograms;

public class WAJP_TO_REPLACE_WORDS_IN_A_STRING {

	public static void main(String[] args) {
		
		String str="my name a chaitanya";		
		
		String wordtoreplace=" a ";
		String replacementword="is";
		String st = str.replaceAll(wordtoreplace, " "+replacementword+" ");	
		System.out.println(st);
		
//		System.out.println(str.substring(0, 7)+"is"+str.substring(7));
		
		
	}
}
