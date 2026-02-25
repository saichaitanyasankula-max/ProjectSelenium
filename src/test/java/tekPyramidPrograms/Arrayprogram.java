package tekPyramidPrograms;

public class Arrayprogram {

	public static void main(String[] args) {
		
		String str[]= {"ab","abba","abda","abd","abe"};
		
		for (int i = 0; i < str.length; i++) {
			
			char ch[]=str[i].toCharArray();
			
			boolean re=true;
			
			for (int j = 0; j < ch.length; j++) {
			
				if(ch[j]=='a' || ch[j]=='b' || ch[j]=='e')
				{
					re=true;
				}
				else
				{
					re=false;
					//System.out.println(re+"---->"+ch[j]);
					break;
				}
			
			}
			
			if(re) {
				
				//System.out.println(re);
				
				System.out.println(str[i]);
			}
		}
	}
}
