package tekPyramidPrograms;

public class WAJP_TO_FIND_THE_SUM_OF_TWO_ARRAYS {

	public static void main(String[] args) {

		int a[]= {2,4,5,5,8};

		int b[]= {5,6,7,6,7,8};

		int c[]=new int[a.length+b.length];

		//System.out.println(c.length);


		for (int i = 0; i <a.length; i++) {

			c[i]=a[i]+b[i];
			System.out.println(c[i]);
		}
	}
}
