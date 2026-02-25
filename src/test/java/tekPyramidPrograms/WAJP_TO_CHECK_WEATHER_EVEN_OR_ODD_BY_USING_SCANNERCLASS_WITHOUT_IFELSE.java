package tekPyramidPrograms;

import java.util.Iterator;
import java.util.Scanner;

public class WAJP_TO_CHECK_WEATHER_EVEN_OR_ODD_BY_USING_SCANNERCLASS_WITHOUT_IFELSE {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Type a number to check weather it is even or odd");
		
		int number = sc.nextInt();
		
		while(number%2==0)
		{
			System.out.println(number+"it is an even number");
			break;
		}
		
		System.out.println(number+"it is an odd number");
	}
}
