package tekPyramidPrograms;

public class Fetch_6_output {

	public static void main(String[] args) {
		
		String str="after (65) pm and 17";
		
		//String[] str1 = str.split(" ");
		char ch[]=str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]>'0' && ch[i]<'9' && ch[i]=='(' && ch[i]==')')
				
				System.out.println(ch[i]);
			
		}
	}
}
