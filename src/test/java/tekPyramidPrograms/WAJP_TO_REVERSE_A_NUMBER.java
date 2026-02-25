package tekPyramidPrograms;

public class WAJP_TO_REVERSE_A_NUMBER {

	public static void main(String[] args) {
		
		int n=123;
		
		int rev=0;
		
		for(int i=0;i<n;i++) {
			
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		
	}
}
