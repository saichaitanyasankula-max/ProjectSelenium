package tekPyramidPrograms;

/*
 * 
 * 	1 A 2 B 
	3 C 4 D 
	5 E 6 F 
	7 G 8 H 
 */
public class Mixpattern6 {

	public static void main(String[] args) {
		
		char ch='A'; int n=1;
		
		for (int i = 0; i < 4; i++) {
			  
			for (int j = 0; j < 4; j++) {

				if(j%2==0)
				{
					System.out.print(n+" ");
					n++;
					
				}
				else {
					System.out.print(ch+" ");
					ch++;
				}
			}
			System.out.println();
			
		}

}
}