package tekPyramidPrograms;

public class WAJP_TO_COUNT_THE_VOWLES_AND_CONSONENTS_IN_A_STRING {

	public static void main(String[] args) {
		
		String str="abcdeoiufgh";
		
		char ch[]=str.toCharArray();
		
		int vowles=0; int consonents=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>'a' || ch[i]<'z')
			{
				if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
				{
					vowles++;
				}
				else
				{
					consonents++;
				}
			}
			
		}
		System.out.println("vowles"+"---->"+vowles);
		System.out.println("consonents"+"---->"+consonents);
		
	}
}
