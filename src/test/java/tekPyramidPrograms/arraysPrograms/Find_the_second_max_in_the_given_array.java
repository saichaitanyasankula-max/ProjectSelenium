package tekPyramidPrograms.arraysPrograms;

public class Find_the_second_max_in_the_given_array {

	public static void main(String[] args) {
		
		int a[]= {25,34,33,25,32};

		int firstmax=Integer.MIN_VALUE;
		int secondmax=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {

			if(firstmax<a[i]) {
				secondmax=firstmax;
				firstmax=a[i];
			}
			else if((a[i] > secondmax && a[i] != firstmax)){
				secondmax=a[i];	
			}
		}
		System.out.println("second maximum value"+secondmax);
	}
}
