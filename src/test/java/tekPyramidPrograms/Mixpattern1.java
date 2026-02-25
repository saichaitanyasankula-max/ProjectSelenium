package tekPyramidPrograms;

/*
 * A B C D 
   1 2 3 4 
   E F G H 
   5 6 7 8
 * 
 */
public class Mixpattern1 {

	public static void main(String[] args) {

		char ch='A'; int n=1;

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {

				if(i%2==0)
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

