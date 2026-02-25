package tekPyramidPrograms;

import java.util.HashMap;
import java.util.Iterator;

public class Arryas {

	public static void main(String[] args) {
	
		int a[]= {8,4,1,9,6,2};
		
		for (int i = 0; i < a.length; i++) {
			int temp=0;
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j]) {
					
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			
			}
		}
			System.out.println(a[i]);
	}
}
}