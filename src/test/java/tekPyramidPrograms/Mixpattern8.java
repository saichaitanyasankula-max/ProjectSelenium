package tekPyramidPrograms;

/*
 * 	A B C D 
	1 2 3 4 
	E F G H 
	5 6 7 8 
 * 
 */
public class Mixpattern8 {

	public static void main(String[] args) {

		 int n=1;
		 char ch='A';
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < 4; j++) {

				if(i%2==0)
				{
					System.out.print(ch+" ");
					ch+=2;
				}
				else {
					System.out.print(n+" ");
					n+=2;
				}
			}
			System.out.println();
		}
	}
}
