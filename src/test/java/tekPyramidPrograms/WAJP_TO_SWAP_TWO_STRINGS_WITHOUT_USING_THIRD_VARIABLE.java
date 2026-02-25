package tekPyramidPrograms;

public class WAJP_TO_SWAP_TWO_STRINGS_WITHOUT_USING_THIRD_VARIABLE {

	public static void main(String[] args) {
		
		String one="hai";
		
		String two="hello";
		
		System.out.println("Before Swapping");
		
		System.out.println("firstVariable"+"---->"+ one);
		
		System.out.println("secondVariable"+"---->"+ two);
		
		System.out.println("===========");
		
		one=one+" "+two;
		
		System.out.println("varaible one"+one);
		
		System.out.println("it is substring"+one.indexOf(" "));
		
		two=one.substring(0,one.indexOf(" "));
		
		System.out.println(two+""+"*******");
		
		one=one.substring(one.indexOf(" ")+1);
		
		System.out.println(one+""+"------");
		
		System.out.println(one);
		
		System.out.println(two);
		
	}
}
