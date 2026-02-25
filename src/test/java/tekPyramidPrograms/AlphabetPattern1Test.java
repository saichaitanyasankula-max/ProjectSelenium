package tekPyramidPrograms;

import java.util.Iterator;

/*
 * A B C D 
   E F G H 
   I J K L 
   M N O P 
 */
public class AlphabetPattern1Test {

	public void program3() {
		
		char ch='A';
		
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < 4; j++) {
				
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			
		}
	}
}
