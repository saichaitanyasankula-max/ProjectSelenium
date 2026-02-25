package tekPyramidPrograms;

public class WAJP_TO_FIND_THE_COUNT_OF_TWO_CONSECUTIVE_NUMBERS {

	public static void main(String[] args) {
		
		int a[]= {1,1,1,1,1,0,1,1,1,1,0,1,1,1,0,1,1,1,1,1,1};
		
		int count=0;
		
		int max=0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==1)
			{
				count++;
			}
			else
			{
				count=0;
			}
			
			max=Math.max(max, count);
		}
		System.out.println(max);
		
		System.out.println(count);
		
	}
}

