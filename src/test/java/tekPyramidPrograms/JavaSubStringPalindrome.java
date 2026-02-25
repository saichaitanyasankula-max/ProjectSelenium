package tekPyramidPrograms;

public class JavaSubStringPalindrome {

	public static void main(String[] args) {
		
		String str="caabbc";
		
		for (int i = 0; i <=str.length(); i++) {
			
			for (int j = i; j <=str.length(); j++) {
				
				String sub = str.substring(i,j);
				
				System.out.println(sub);
			}
		}
	}
}
