package tekPyramidPrograms;

public class Snippet {
	
	public static void main(String[] args) {
		
		String str="sai chaitanya";
		
		char ch[]=str.toCharArray();
		
		boolean b[]=new boolean[ch.length];
		
		for (int i = 0; i < ch.length; i++) {
			
			System.out.println(b[i]);
			
			if(b[i] || ch[i]==' ') {
				
				continue;
			}
			
			int count=1;
			
			for (int j = i+1; j <=ch.length-1; j++) {
				
				if(ch[i]==ch[j])
				{
					count++;	
					b[j]=true;
				}
				
			}
			
		System.out.println(ch[i]+"----->"+count);
			
		}
	}
}

