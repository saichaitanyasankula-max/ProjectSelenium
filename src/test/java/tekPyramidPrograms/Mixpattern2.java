package tekPyramidPrograms;

/*
 * 	A A A A 
	1 1 1 1 
	B B B B 
	1 1 1 1 
 * 
 */
public class Mixpattern2 {

	public static void main(String[] args) {

		 int n=1;
		 char ch='A';
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < 4; j++) {

				if(i%2==0)
				{
					System.out.print(ch+" ");
				}
				else {
					System.out.print(n+" ");
				}
			}
			System.out.println();
			if(ch=='A') {
			ch='A';
			ch++;
			}
			else
			{
				n=1;
				
			}
		}
		
	}
}