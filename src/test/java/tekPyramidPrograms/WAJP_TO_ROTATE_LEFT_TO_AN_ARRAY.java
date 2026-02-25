package tekPyramidPrograms;

import java.util.Iterator;
import java.util.Scanner;

public class WAJP_TO_ROTATE_LEFT_TO_AN_ARRAY {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,8,9};

//		Scanner sc=new Scanner(System.in);
//
//		System.out.println("Enter the number");
//		
//		int number=sc.nextInt();

		for(int i=0;i<a.length;i++)
		{
			int first=a[0];

			for (int j = 0; j < a.length-1; j++) {

				a[j]=a[j+1];
			}
			a[a.length-1]=first;
		}

		for (int k = 0; k < a.length; k++) {
 
			System.out.print(a[k]+" ");
		}
	}

}
