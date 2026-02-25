package tekPyramidPrograms;

public class WAJP_TO_SWAP_THE_ADJECENT_CHARACTER_IN_A_STRING {

	public static void main(String[] args) {
		
		String str="mint boys";
		
		char ch[]=str.toCharArray();
		
		System.out.println(ch);
		
		for(int i=0;i<ch.length-1;i+=2)
		{
			char temp=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
		//	System.out.println(temp);
		}
		
	System.out.println(ch);
		
	}
}
