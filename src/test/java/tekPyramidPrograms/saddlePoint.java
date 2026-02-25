package tekPyramidPrograms;

import java.util.Scanner;

public class saddlePoint{
public static void main(String[] args) {
	
	//two dimensional array
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter row size");
	int rows = sc.nextInt();
	
	System.out.println("Enter coloum size");
	int col=sc.nextInt();
	
	int matrix[][]=new int[rows][col];
	
	System.out.println("enter the values");
	
	for (int i = 0; i < matrix.length; i++) {
		
		for (int j = 0; j < matrix.length; j++) {
			
			matrix[i][j]=sc.nextInt();
		}
	}
	
	for (int i = 0; i < matrix.length; i++) {
		
		for (int j = 0; j < matrix.length; j++) {
		
			System.out.println(matrix[i][j]);
		}
		
		
	}
	}
}