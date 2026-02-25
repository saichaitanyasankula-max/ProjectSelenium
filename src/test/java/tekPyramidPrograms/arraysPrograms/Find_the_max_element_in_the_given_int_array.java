package tekPyramidPrograms.arraysPrograms;

public class Find_the_max_element_in_the_given_int_array {

	public static void main(String[] args) {
		
		int a[]= {55,32,88,99,774};
		
		int max=a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
