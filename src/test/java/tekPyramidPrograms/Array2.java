package tekPyramidPrograms;

public class Array2 {

	public static void main(String[] args) {
		
		int a[]= {1,5,7,8,9,9,9,9,2,3,4,5,5,5,5,7,8,8,8,8,8};

		int count=1;
		
		for (int i = 1; i <=a.length-1; i++) {
			
			if(a[i]==a[i-1])
			{
				count++;
			}
			else
				
			{
				if(count>1)
					{
						System.out.println(a[i]+"----->"+count);
					}
				//System.out.println(a[i-1]+"---->"+count);
				count=1;
			}
			
//			
		}
		
		
		System.out.println(a[a.length-1]+"---->"+count);
		
		
	}
}
