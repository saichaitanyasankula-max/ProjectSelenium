package tekPyramidPrograms;

public class WAJP_TO_FIND_THE_HIGHEST_PALINDROME_IN_A_STRIN {

	public static void main(String[] args) {
		
		String s="geegsoundsooos";
	
		
		for (int i = 0; i<=s.length(); i++) {
			
			for (int j = i+1; j<=s.length(); j++) {
				
				String str = s.substring(i, j);
				
				int len = str.length();
				
				if(len>=3)
				{
					String temp="";
					
					for (int k = len-1; k >=0; k--) {
						temp=temp+str.charAt(k);
					}
					if(temp.equalsIgnoreCase(str)) {
						
						System.out.println(str+":is palindrome string");
					}
				}
			}
			
		}
		
		
		
		
		
		}
	}

