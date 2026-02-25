package tekPyramidPrograms;

import java.util.HashMap;
import java.util.TreeSet;

public class WAJP_TO_MERGE_THE_ARRAY_AND_SORT_IT {

	public static void main(String[] args) {
		
		int a[]= {5,6,7,8};
		
		int b[]= {1,8,9};
		
		int c[]= new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		
		for(int j=0;j<b.length;j++)
		{
			c[a.length+j]=b[j];
		}
		
		for(int k=0;k<c.length;k++)
		{
			System.out.print(c[k]);	
		}
		
		System.out.println();
		
//		TreeSet ts=new TreeSet();
//		
//		for(int i=0;i<c.length;i++)
//		{
//			ts.add(c[i]);
//		}
//		
//		System.out.println(ts);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
}
