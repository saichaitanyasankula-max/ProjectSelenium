package tekPyramidPrograms;

public class RepatingWordsIntwoStrings {

	public static void main(String[] args) {
		
		String str="1122333444";
		
		String str1="11222233334444";
		
		String s[]=str.split(" ");
		String s1[]=str1.split(" ");
		
		for (int i = 0; i <=s.length-1; i++) {
			
			int count=0;
			
			for (int j = 0; j <=s1.length-1; j++) {
				
				if(s[i]==s[j])
				{
					count++;
				}
				
			}
			System.out.println(count);
		}
	}
}
