package javaTopics;

public class UsingNormalExpression {

	public static void main(String[] args) {
		
		audi a=new audi();
		a.drive();
		
		car C1=new car() {
			
			@Override
			public void drive() {
				
				System.out.println("Driving BMW");
				
			}
		};
		
		C1.drive();
		
		//Using Lamda Expression with anonymous function
		//car C2=() -> {System.out.println("Driving TATA");};
		
		//C2.drive();
		
	}
}

class audi implements car{
	
	@Override
	public void drive() {
		System.out.println("Driving audi");
	}
}

@FunctionalInterface
interface car{
	
	public void drive();
}
