import java.util.Iterator;

public class reverseFirstlast {

	public static void main(String[] args) {
		
		String s="I am an automation engineer";
		
		String[] s1 = s.split(" ");
		
		for (int i = 0; i <= s1.length-1; i++) {
			
			char a[]=s1[i].toCharArray();
			
			for (int j =a.length-1; j >=0; j--) {
				
				if(a[j]==a[0]) {
					
					System.out.print(a[j]);
				}
			}
			
			}
		}
	}

