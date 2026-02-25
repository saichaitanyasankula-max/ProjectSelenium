package tekPyramidPrograms;

import org.testng.annotations.Test;

public class aaabbbaabbbbTest {
	
	@Test
	public void program1(){
		
		String str="hello hai hello mam"; String op="";
		
	//	char ch[]=str.toCharArray();
		
		String[] ch = str.split(" ");
		
		int count=1;
		
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]==ch[i+1])
			{
				count++;
			}
			else
			{
				op=op+ch[i]+"---->"+count;
				//count=1;
			}
			System.out.println();
		}
		
		op=op+ch[ch.length-1]+"--->"+count;
		
		System.out.println(op);
		
	}
}
