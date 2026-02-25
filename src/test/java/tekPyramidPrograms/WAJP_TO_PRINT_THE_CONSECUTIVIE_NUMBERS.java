package tekPyramidPrograms;

public class WAJP_TO_PRINT_THE_CONSECUTIVIE_NUMBERS {

	public static void main(String[] args) {
		
		int a[]= {1,1,0,1,1,1,1,1,1,1,1,1,1,10,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		
		int max =0;
		
		int feq=0;
		
		for (int i = 0; i <a.length-1; i++) {
		
			if(a[i]==a[i+1])//if(a[i]==a[i+1])
			{
				feq++;
				max=Math.max(max,feq);
			}
			else
			{
				feq=0;
			}
		}
		System.out.println("feq of is"+max);
		//System.out.println(a[a.length-1]);
	}
}
