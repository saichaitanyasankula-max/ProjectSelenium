package tekPyramidPrograms;

public class SingleTonClass {

/*
 * ---------------------------------------------------------------------------------------------------------------------
 */
							//Early intialization
	
	//i have created an object for this class egarly
	
	//why we are making it as private static because i dont wont to access this object anywhere a part from this class
	
	//why it is static means it belongs to the class not for the object
	
	//all the static members will be preloaded into the memory
	
	//1 - Step
//	private static SingleTonClass st=new SingleTonClass();
	
	//2-Step 
	//Making constructor as private we cant creat the object outside of the class with the help of the new keyword
//	private SingleTonClass(){
//		
//	}
//	
//	public static SingleTonClass getInstance()
//	{
//		
//		return st;
//	}

/*
 *---------------------------------------------------------------------------------------------------------------------- 
 */
							//Lazy Intialization
	
	//Step - 1
	//private static SingleTonClass object;
	
	//Step - 2
	//private SingleTonClass() {
		
		
//	}
	//Step - 3
	//public static SingleTonClass getInstance() {
		
//		if(object==null)
//		{
//			object=new SingleTonClass();
//		}
//		
//		return object;
//	}
	
	//Disadvantage - when ever the two threds are accessing parallel in the memory it is going to create the two obejcts
//	}

	
/*
 * -------------------------------------------------------------------------------------------------------------------------
 */

						//Synchronization 
	
	//Synchronized is a key word that which is having the lock and unlock feature so when ever the object is null it is going to 
	//create the block in memory 
	
	//we are using the synchronized in the method level which will be very slow 

//		private static SingleTonClass object;
//		
//		private SingleTonClass() {
//			
//			
//		}
//		
//		synchronized public static SingleTonClass getInstance() {
//			
//			if(object==null)
//			{
//				object=new SingleTonClass();
//			}
//			
//			return object;
//		}
/*
 * ---------------------------------------------------------------------------------------------------------------------
 */
										//Double check 
	
	private static SingleTonClass object;
	
	private SingleTonClass() {
		
		
	}
	
	 public static SingleTonClass getInstance() {
		
		if(object==null)
		{
			synchronized(SingleTonClass.class)
			{
				if(object==null) {
				object=new SingleTonClass();
			}
			
		}
		}
		return object;
	
	 }
		}
