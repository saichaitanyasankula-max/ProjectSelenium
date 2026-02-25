package tekPyramidPrograms;

import java.util.Iterator;

public class WAJP_TO_PRINT_THE_FIBNACCIO_SERIS {

	public static void main(String[] args) {
		
		int a=0;
		
		int b=1;
		
		int n=5;
		
		for (int i = 0; i < n; i++) {
			
			int sum=a+b;
			
			System.out.println(sum);
			
			a=b;
			b=sum;
		}
	}
}
