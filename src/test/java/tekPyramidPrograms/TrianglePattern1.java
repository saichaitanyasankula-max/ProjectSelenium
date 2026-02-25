package tekPyramidPrograms;

public class TrianglePattern1 {

	public static void main(String[] args) {
		
		int n=4;
		 int count=1;
		for(int i=0;i<n;i++)
		{
			
			for (int j = 0; j<n; j++) {
				
				if(i+j<=n-1)
				{
					
					System.out.print(count);
					count++;
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
}
