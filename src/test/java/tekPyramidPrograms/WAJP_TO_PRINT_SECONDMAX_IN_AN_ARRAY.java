package tekPyramidPrograms;

public class WAJP_TO_PRINT_SECONDMAX_IN_AN_ARRAY {

	public static void main(String[] args) {
		
		int a[]= {2,4,6,8,1,30,29};
		
		int firstmax=Integer.MIN_VALUE;
		int secondmax=Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			
			if(firstmax<a[i]) 
			{
				secondmax=firstmax;
				firstmax=a[i]; 
			}
			else if(firstmax>a[i] && secondmax!=a[i])
			{
				
				secondmax=a[i];
			}
		}
		
		System.out.println(secondmax);
		System.out.println(firstmax);
	}
}
