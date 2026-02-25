package tekPyramidPrograms;

public class WAJP_TO_PRINT_THE_COUNT_OF_FACTORS_OF_A_NUMBER {

	public static void main(String[] args) {
		
		int n=3;
		
		int count=0;
		
		for (int i = 1; i <=n; i++) {
		
			if(n%i==0)
			{
				System.out.println(i);
				count++;
				
			}
		}
		System.out.println(count);
	}
}

