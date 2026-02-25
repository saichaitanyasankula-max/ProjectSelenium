package tekPyramidPrograms;

/*
 * 
 * A B C D 
   A B C D 
   A B C D 
   A B C D 
 */
public class AlphabetPattern3 {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) { 
			char ch='A';
			for (int j = 0; j < 4; j++) {
				{
					System.out.print(ch+" ");
					ch++;
				}
			}
			System.out.println();
		}
	}
}
