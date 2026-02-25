package tekPyramidPrograms;

public class WAJP_TO_FIND_THE_SUM_OF_THE_NUMBERS_IN_AN_ARRAY {

	public static void main(String[] args) {
		
		int a[]= {5,6,7,8};
		
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			
			sum=sum+a[i];
		}
		
		System.out.println(sum);
	}
}
