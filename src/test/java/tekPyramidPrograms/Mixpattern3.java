package tekPyramidPrograms;

/*
 * 	A 1 B 2 
	A 1 B 2 
	A 1 B 2 
	A 1 B 2 
 * 
 */
public class Mixpattern3 {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			char ch='A';  int n=1;
			for (int j = 0; j < 4; j++) {

				if(j%2==0)
				{
					System.out.print(ch+" ");
					ch++;
				}
				else {
					System.out.print(n+" ");
					n++;
				}
			}
			System.out.println();
			
		}
		
	}
}
