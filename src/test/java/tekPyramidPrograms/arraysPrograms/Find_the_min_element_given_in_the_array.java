package tekPyramidPrograms.arraysPrograms;

public class Find_the_min_element_given_in_the_array {

	public static void main(String[] args) {
		
		int a[]= {55,32,11,52,44};
		
		int min=a[0];

		for (int i = 0; i < a.length; i++) {
			
			if(a[i]<min)
			{
				min=a[i];
				
			}
			
		}
		System.out.println(min);
	}
}
