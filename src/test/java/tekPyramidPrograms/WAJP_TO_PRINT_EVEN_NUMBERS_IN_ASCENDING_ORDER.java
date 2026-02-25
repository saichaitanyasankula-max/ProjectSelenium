package tekPyramidPrograms;

import java.util.ArrayList;
import java.util.Iterator;

import collections.ArraylistDemo;

public class WAJP_TO_PRINT_EVEN_NUMBERS_IN_ASCENDING_ORDER {

	public static void main(String[] args) {

		int a[]= {11,66,77,22,4,55,6,99,71};

		for (int i = 0; i < a.length-1; i++) {

			for (int j = 0; j < a.length-1; j++) {

				if(a[j]>a[j+1]) {

					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		ArrayList ae=new ArrayList();
		
		System.out.println("Even numbers in ascending order");
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				ae.add(a[i]);
				System.out.println(a[i]);
			}
		}
//		for (int i : a) {
//			
//			if(i%2==0)
//			{
//				System.out.println(i);
//			}
//		}
		
		System.out.println("Odd numbers in descending order");
		
		for (int j = a.length-1; j >=0; j--) {

			if(a[j]%2!=0) {
				
				ae.add(a[j]);
				System.out.println(a[j]);
			}
		}
		System.out.println(ae);
	}
}
