package tekPyramidPrograms;

public class BalancedStrin {


	public static void main(String[] args) {

		int num=3234;
		int evensum=0;
		int oddsum=0;

		while(num>0) {
			
			int digit=num%10;
			if(digit%2==0)
			{
				evensum=digit+evensum;
			}
			else
			{
				oddsum=digit+oddsum;
			}
			num=num/10;
		}
		System.out.println(evensum);
		System.out.println(oddsum);
		
		if(evensum==oddsum)
		{
			System.out.println("it is balanced string");
		}
		else
		{
			System.out.println("it is not balanced string");
		}
		
	}

}
