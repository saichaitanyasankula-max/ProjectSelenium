package tekPyramidPrograms;

public class WAJP_TO_PRINT_ALL_THE_DIGITS_FROM_LAST_PLACE {

	public static void main(String[] args) {
		
		int a=12345;
		
		int temp=0;
		
		while(a>0)
		{
			temp=a%10;
			System.out.print(temp);
			a=a/10;
		}
	}
}
