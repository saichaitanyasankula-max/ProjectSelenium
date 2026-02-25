package tekPyramidPrograms;

public class WAJP_TO_PRINT_THE_LAST_DIGIT_OF_A_NUMBER {

	public static void main(String[] args) {
		
		int n=25345;
		int temp=n;
		
		int rem=0;
		while(n>0)
		{
			n=n%10;
			rem=n+rem;
			n=n/10;
		}
		
		System.out.println(rem);
	}
}
