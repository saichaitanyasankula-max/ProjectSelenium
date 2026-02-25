package tekPyramidPrograms;

public class WAJP_TO_FIND_THE_SUBSTRING_IN_A_STRING {

	public static void main(String[] args) {

		String str="abcdeft";

		String st="";


		for (int i = 0; i < str.length(); i++) {

			for (int j = i+1; j < str.length(); j++) {


				st =str.substring(i, j);
				
				System.out.println(st);

			}
		}

	}
}
