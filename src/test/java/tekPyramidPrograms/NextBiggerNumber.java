package tekPyramidPrograms;

import java.util.Arrays;
import java.util.HashMap;

public class NextBiggerNumber {
	
	public static void main(String[] args) {
		
		int a[]= {1,5,8,9,11,12,32};
		
		int a1[]= {1,5,8,9,11,12,32};
		
		Arrays.sort(a);
		
		HashMap<Integer, Object> hs= new HashMap<Integer, Object>();
		
		for(int i=0;i<a.length;i++)
		{
			if(i==a.length-1) {
				
				System.out.println(a.length-1);
				
				hs.put(a[i], "");
			}
			else
			{
				hs.put(a[i], a[i+1]);
			}
		}
		System.out.println(hs);
		
		for (int j = 0; j < a1.length; j++) {
			
			System.out.println(a1[j]+"---->"+hs.get(a1[j])+" ");
			
		}
	}
}
