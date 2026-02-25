package tekPyramidPrograms.arraysPrograms;

public class Find_The_Sum_of_all_the_given_elements_in_an_array {

	public static void main(String[] args) {
		
		int sum[]= {5,9,7,6,2};
		
		int sum1=0;
		for(int i=0;i<sum.length-1;i++)
		{
			sum1=sum[i]+sum1;
		}
		System.out.println(sum1);
	}
}
