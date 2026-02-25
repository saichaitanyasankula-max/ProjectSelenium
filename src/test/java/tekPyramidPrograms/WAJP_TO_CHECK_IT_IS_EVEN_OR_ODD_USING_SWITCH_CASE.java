package tekPyramidPrograms;

import java.util.Scanner;

public class WAJP_TO_CHECK_IT_IS_EVEN_OR_ODD_USING_SWITCH_CASE {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("give a number");
		
		int num = sc.nextInt();
		
		int reminder=num%2;
			
		switch(reminder)
		{
		case 0:System.out.println("it is an even number");
		break;
		
		case 1:System.out.println("it is an odd number");
		break;
		}
	}
}
