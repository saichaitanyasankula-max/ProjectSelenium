package tekPyramidPrograms;

import java.util.ArrayList;

public class ArrayProgramMultiplying {

	public static void main(String[] args) {

		int a[]= {1,2,3,4};

		int output[]=new int[a.length];

		for(int i=0;i<a.length;i++) {

			int product=1;

			for (int j = 0; j < a.length; j++) {

				if(i!=j) {

					product*=a[j];
				}

			}
			output[i]=product;

		}
		System.out.print("{");
		for(int i=0;i<output.length;i++)
		{
			System.out.print(output[i]);
			if(i<output.length-1)
			{
				System.out.print(",");
			}
		}
		System.out.println("}");
	}
}
