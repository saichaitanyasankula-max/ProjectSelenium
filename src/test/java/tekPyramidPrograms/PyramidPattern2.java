package tekPyramidPrograms;

/*
 * 
 * 		  *
  		 ***
  		*****
  	   *******
 */
public class PyramidPattern2 {

	public static void main(String[] args) {
		int n=4;
		int z=1;
		
		// Loop through each row
		for (int i = 1; i <= n; i++) {// 
			
			// Print leading spaces
			
			for (int j = n-1; j >= i; j--) {
				System.out.print(" "); // Print spaces
			}

			// Print stars
			for (int k = 1; k <= z; k++) {
				System.out.print("*"); // Print stars with a space
			}
			

			// Move to the next line after each row
			System.out.println();
			
			z+=2;
		}
	}
}

