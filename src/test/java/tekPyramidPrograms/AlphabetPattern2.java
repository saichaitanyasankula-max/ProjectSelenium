package tekPyramidPrograms;

/*
 * 
 * A A A A 
   B B B B 
   C C C C 
   D D D D 
 */
public class AlphabetPattern2 {

	public static void main(String[] args) {

		char ch='A';
		for (int i = 0; i < 4; i++) { 
			
			for (int j = 0; j < 4; j++) {
				
				{
					System.out.print(ch+" ");
				}
				
			}
			System.out.println();
			ch++;
	
			
		}
	}
}