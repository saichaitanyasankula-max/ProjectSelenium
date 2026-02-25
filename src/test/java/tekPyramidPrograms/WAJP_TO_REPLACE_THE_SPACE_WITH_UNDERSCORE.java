package tekPyramidPrograms;

public class WAJP_TO_REPLACE_THE_SPACE_WITH_UNDERSCORE {

	public static void main(String[] args) {
		
		String str="My name is xyz";
		
		char[] ch=str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]==' ')
			
			{
				System.out.print("_");
			}
			else
			{
				System.out.print(ch[i]);
			}
		}
	}
}
