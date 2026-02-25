package tekPyramidPrograms;

public class Count_words_in_a_given_String {

	public static void main(String[] args) {
		
		String str="This is sai chaitanya";
		
		String st[]=str.split(" ");
		
		int  count=0;
		
		for (int i = 0; i < st.length; i++) {
			
			
			count++;
			
			System.out.println(st[i]+"---->"+count);
		}
		
		
	}
}
