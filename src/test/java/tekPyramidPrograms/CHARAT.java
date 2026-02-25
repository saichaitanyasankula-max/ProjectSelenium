package tekPyramidPrograms;

import java.util.Iterator;

public class CHARAT {

	public static void main(String[] args) {
		
		String str="a13b14c15";
		
		for(int i=0;i<str.length();i++)
		{
			char s = str.charAt(i);
			
			if(s>='0' && s<='9')
			{
				System.out.println(s);
			}
		}
	}
}
