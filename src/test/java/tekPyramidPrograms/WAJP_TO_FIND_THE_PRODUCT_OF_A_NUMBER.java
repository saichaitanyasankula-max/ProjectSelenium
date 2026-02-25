package tekPyramidPrograms;

public class WAJP_TO_FIND_THE_PRODUCT_OF_A_NUMBER {

	public static void main(String[] args) {
		
		int a=54321;
		
		int prod=1;
		while(a>0)
		{
			int rem=a%10;
			prod=prod*rem;
			a=a/10;
		}
		System.out.println(prod);
	}
	
}
