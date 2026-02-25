package tekPyramidPrograms;

public class WAJP_TO_PRINT_THE_SUM_OF_DIGITS_IN_A_GIVEN_NUMBER {

	public static void main(String[] args) {
		
		int a=12345;
		
		int count=0;
		
		while(a>0)
		{
			int rem=a%10;
			
			count=count+rem;
			
			a=a/10;
		}
		System.out.println(count);
		
	}
}
