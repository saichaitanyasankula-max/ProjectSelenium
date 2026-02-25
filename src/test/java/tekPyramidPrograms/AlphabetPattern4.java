package tekPyramidPrograms;

public class AlphabetPattern4 {
	    public static void main(String[] args) {
	        
	        int n=4;
	         char ch='A';
	        for(int i=0;i<n;i++)
	        {
	            char ch1=ch;
	            for(int j=0;j<n;j++)
	            {
	                System.out.print(ch1);
	                ch1+=4;
	            }
	            ch++;
	           System.out.println(" "); 
	        }
	        
	    }
	
}
