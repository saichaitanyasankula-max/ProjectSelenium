package tekPyramidPrograms.arraysPrograms;

public class Find_the_second_min_element_in_an_array {

	public static void main(String[] args) {
		
		int a[]= {25,34,33,25,44,89,20};
		
		int firstmin=Integer.MAX_VALUE;
		int secondmin=Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			
			if(firstmin>a[i])
			{
				secondmin=firstmin;
				firstmin=a[i];
			}
			else if(a[i]<secondmin && a[i]!=firstmin)
			{
				secondmin=firstmin;
			}
		}
		System.out.println(secondmin);
	}
}
