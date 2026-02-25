package tekPyramidPrograms;

import java.util.ArrayList;

public class WAJP_TO_MERGE_ARRAYS_AND_GET_THE_DUPLICATE {

	public static void main(String[] args) {

		String a[]= {"aa","bb","cc","dd"};

		String b[]= {"aa","bb","ff","gg"};

		String c[]=new String[a.length+b.length];

	//	ArrayList ar=new ArrayList();

		for (int i = 0; i <=a.length-1; i++) {

			c[i]=a[i];
		}
		for (int i = 0; i <=b.length-1; i++) {

			c[a.length+i]=b[i];
		}

//		for (Object merge : c) {
//
//			ar.add(merge);
//		}
//		System.out.println(ar);
		
		System.out.println(c.length);
		for (int i = 0; i < c.length; i++) {

			int count=0;//

			for (int j = 0; j < c.length; j++) {

				if(c[i]==c[j]) {// 

					if(i>j) 
					{
						break;
					}
					else
					{
						count++; 
					
					}
				}
			}
			
			if(count==1) {
				System.out.println(c[i]+"-------->"+count);	
			}
			
		}
	}
}

