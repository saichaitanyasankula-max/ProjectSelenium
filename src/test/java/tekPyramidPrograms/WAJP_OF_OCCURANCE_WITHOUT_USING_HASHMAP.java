package tekPyramidPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class WAJP_OF_OCCURANCE_WITHOUT_USING_HASHMAP {

	public static void main(String[] args) {

		String str="readdyy helloe te";
		
		String []s=str.split(" ");
		
		for (int i = 0; i < s.length; i++) {

			int count=0;

			for (int j = 0; j < s.length; j++) {

				if(s[i]==s[j]) {

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
				System.out.println(s[i]+"-------->"+count);	
			}
			
		}

	}
}
