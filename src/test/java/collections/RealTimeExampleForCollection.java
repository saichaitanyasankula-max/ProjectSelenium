package collections;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class RealTimeExampleForCollection {

	@Test
	public void collection() {
		
		Scanner sc=new Scanner(System.in);
		
		int size=5;
		
		System.out.println("Enter the element into an array");
		
		ArrayList al=new ArrayList();
	
	for (int i = 0; i < size; i++) {
		
		int e = sc.nextInt();
		al.add(e);
		
		if(al.contains(e))
		{
			
		}
	}
	
	System.out.println(al);	
		
	}
}
