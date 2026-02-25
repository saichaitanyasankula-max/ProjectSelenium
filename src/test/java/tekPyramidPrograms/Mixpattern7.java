package tekPyramidPrograms;

/*
 * 
 * 	A A A A 
	2 4 6 8 
	B B B B 
	10 12 14 16 
 */
public class Mixpattern7 {

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
					n++;
				}
			}
			System.out.println();
			
			if(ch=='A') {
			ch='A';
			ch++;
			}
			else
			{
				
			}
		}
	}
}
