package exceptions;

public class Exception {

	public static void m1() {
		
		m2();
	}
	public static void m2() {
		
	System.out.println(10/0);
	
	}
	public static void main(String[] args) {
		
	m2();	
		
	}
}
