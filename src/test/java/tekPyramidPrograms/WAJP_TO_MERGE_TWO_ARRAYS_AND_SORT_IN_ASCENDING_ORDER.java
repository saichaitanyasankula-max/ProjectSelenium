package tekPyramidPrograms;

import java.util.TreeSet;

public class WAJP_TO_MERGE_TWO_ARRAYS_AND_SORT_IN_ASCENDING_ORDER {

	public static void main(String[] args) {
		
String a[]= {"abc","Test","Automation"};
		
		String b[]= {"sample","xyz","Hudson"};
		
		String c[]=new String[a.length+b.length];
		
		TreeSet<String> ts=new TreeSet<String>();
		
		for (int i = 0; i <=a.length-1; i++) {

				c[i]=a[i];
		}
		for (int i = 0; i <=b.length-1; i++) {

				c[a.length+i]=b[i];
			}
		for (String merged : c) {
			
			ts.add(merged);
		}
		System.out.println(ts);
	}
}
