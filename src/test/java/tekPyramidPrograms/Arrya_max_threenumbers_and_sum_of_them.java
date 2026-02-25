package tekPyramidPrograms;

import java.util.Arrays;

public class Arrya_max_threenumbers_and_sum_of_them {

	 public static void main(String[] args) {
		 
	        int a[]={1,2,5,6,7,8,10,12};
	        
	        Arrays.sort(a);
	        
	        int sum=0,firstmax=0,secmax=0,thirdmax=0;
	        
	        for(int i=0;i<a.length-2;i++)
	        {
	            if(a[i]+a[i+1]+a[i+2]>sum)
	            {
	                sum=a[i]+a[i+1]+a[i+2];
	                firstmax=a[i];
	                secmax=a[i+1];
	                thirdmax=a[i+2];
	            }
	        }
	        
	        System.out.println(sum+" "+firstmax+" "+secmax+" "+thirdmax);
	        
	    }
}
