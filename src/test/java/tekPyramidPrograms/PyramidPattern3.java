package tekPyramidPrograms;

/*
 * 
 * 		    1 
  		  2 3 4 
        5 6 7 8 9 
 */
public class PyramidPattern3 {

	public static void main(String[] args) {
		int n=3;
		int z=1;
		int count=1;
		
		// Loop through each row
		for (int i = 1; i <= n; i++) {// 
			
			// Print leading spaces
			
			for (int j = n-1; j >= i; j--) {
				System.out.print("  "); // Print spaces
			}

			// Print stars
			for (int k = 1; k <= z; k++) {
				System.out.print(count+" "); // Print stars with a space
				count++;
			}
			

			// Move to the next line after each row
			System.out.println();
			
			z+=2;
		}
	}
}
