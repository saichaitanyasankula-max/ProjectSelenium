package collections;

import java.util.Stack;

public class stackPractice {

	public static void main(String[] args) {
		
		/*
		 * What are the implementations that are done for the vector same 
		 * actions we can use for the stack also.
		 * 
		 * Stack is a class which implements the list interface and extends the vector class
		 * and also represents the empty principle
		 * 
		 * vector and stack got introduced before the collection 
		 * 
		 * Both are the legacy classes
		 */
		
		Stack<String> books=new Stack();
		
		books.push("Black");
		books.push("Green");
		books.push("Blue");
		
		//Rotate anti clock wise and then imagin
		
		System.out.println(books);
		
		System.out.println("Using peek method"+"----->"+books.peek());
		
		System.out.println("Using search method"+"---->"+books.search("Black"));
		
		System.out.println("Using indexOf method"+"---->"+books.indexOf("Black"));
		
		System.out.println("Using isEmpty method"+"---->"+books.isEmpty());
		
		System.out.println("Using Empty method"+"----->"+books.empty());
		
	}
}
