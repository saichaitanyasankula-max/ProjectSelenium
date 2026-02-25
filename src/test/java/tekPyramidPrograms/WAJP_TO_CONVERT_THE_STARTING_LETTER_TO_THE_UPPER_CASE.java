package tekPyramidPrograms;

public class WAJP_TO_CONVERT_THE_STARTING_LETTER_TO_THE_UPPER_CASE {
	
	public static void main(String[] args) {
		
		String str="i am staying in hyderabad";
		
		String[] s=str.split(" ");
		
		String output=" ";
		
		for (String st : s) {
			
			output=output+st.substring(0,1).toUpperCase()+st.substring(1)+" ";
		}
		System.out.print(output.trim());
	}

}
