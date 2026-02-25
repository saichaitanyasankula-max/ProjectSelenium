package tekPyramidPrograms;

public class WAJP_TO_FIND_THE_CurrencyDenomination {
	
	public static void main(String[] args) {
		
		int a[]= {2000,100,200,500,50,20,10,5,2,1};
		
		int amount=22356;
		
		for (int i = 0; i <a.length; i++) {
			
			int sum=0;
			
			if(amount>=a[i])
			{
				int count=amount/a[i];
				
				amount=amount%a[i];
				
				//System.out.println(count*a[i]);
				
				System.out.println(count+"--->"+a[i]);
				
			}
			
		}
	}

}
