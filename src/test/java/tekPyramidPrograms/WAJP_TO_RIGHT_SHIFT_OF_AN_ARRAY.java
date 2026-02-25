package tekPyramidPrograms;

public class WAJP_TO_RIGHT_SHIFT_OF_AN_ARRAY {

	public static void main(String[] args) {

		int a[]= {0,2,5,8,7,0,2,4,7,0,2,5};

		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}


