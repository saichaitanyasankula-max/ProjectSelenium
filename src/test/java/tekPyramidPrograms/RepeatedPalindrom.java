package tekPyramidPrograms;

public class RepeatedPalindrom {

	public static void main(String[] args) {

		String palindrome="mom dad mom children";

		String[] str=palindrome.split(" ");
	
		for (int i = 0; i < str.length; i++) {
			
			char[] ch=str[i].toCharArray();
			
			for (int j = 0; j < ch.length; j++) {
			
				System.out.println(ch[1]);
			}
		}
	}
}	
