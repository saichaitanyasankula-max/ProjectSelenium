package tekPyramidPrograms;

public class WAJP_TO_FIND_THE_MAX_OF_THREE_NUMBERS_AND_DO_SUM_OF_THREE_NUMBERS {

	    public static void main(String[] args) {
	        int a[] = {2, 4, 6, 8, 1, 30, 29, 15};

	        int firstMax = Integer.MIN_VALUE;
	        int secondMax = Integer.MIN_VALUE;
	        int thirdMax = Integer.MIN_VALUE;

	        
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] > firstMax) 
	            {
	                thirdMax = secondMax;
	                secondMax = firstMax;
	                firstMax = a[i];
	                
	            } 
	            else if (a[i] > secondMax && a[i] != firstMax) 
	            {
	                thirdMax = secondMax;
	                secondMax = a[i];
	                
	            } 
	            else if (a[i] > thirdMax && a[i] != secondMax && a[i] != firstMax)
	            {
	                thirdMax = a[i];
	            }
	        }

	        System.out.println("First Max: " + firstMax);
	        System.out.println("Second Max: " + secondMax);
	        System.out.println("Third Max: " + thirdMax);
	    }
	}