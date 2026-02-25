package tekPyramidPrograms;

import java.util.ArrayList;

import Collections.ArraylistDemo;

public class WAJP_TO_SORT_EVEN_AND_ODD_NUMBERS {

	public static void main(String[] args) {
		 
		int a[]= {32,44,45,33,97,54,7,8,96};
		
		ArrayList even=new ArrayList();
		
		ArrayList odd=new ArrayList();
		
		for (int i = 0; i < a.length-1; i++) {
			
			if(a[i]%2==0)
			{
				even.add(a[i]);
			}
			else
			{
				odd.add(a[i]);
			}
		}
		
	
//		
//		System.out.println("Odd Array"+oddarray);
	}
}
