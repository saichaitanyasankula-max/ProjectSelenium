package tekPyramidPrograms;

public class WAJP_QUARDRENTS_IN_AN_ARRAY {

	public static void main(String[] args) {
		
		int arr[]= {0,0,1,1,1,1,1,1,3,4,5,5,5,5,3,3,2,2,2,2};
		
		for (int i = 1; i <arr.length-1; i++) {
			
			int count=0;
			
			boolean alreadycounted=false;
			
			for (int j = i-1; j < i; j++) {
				
				if(arr[i]==arr[j])
				{
					alreadycounted=true;
					break;
				}
			}
			
			if(!alreadycounted) {
				
				for (int k = 0; k < arr.length; k++) {
					
					if(arr[i]==arr[k])
					{
						count++;
					}
				}
				if(count==4)
				{
					System.out.println(arr[i]+"--->"+count);
				}	
			}
			
		}
	}
}
