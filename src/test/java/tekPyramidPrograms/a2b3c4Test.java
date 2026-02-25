package tekPyramidPrograms;

import org.testng.annotations.Test;

public class a2b3c4Test{

	@Test
	
	public void program2() {

		String str="a2b3c4d5";

		String result="";

		for (int i = 0; i < str.length(); i+=2) {// 

			char ch=str.charAt(i);  //a

			int count=str.charAt(i+1)-48;
			
			System.out.println(count);

			for (int j = 0; j < count; j++) {

				//				result+=ch;
				result=result+ch;

			}

		}

		System.out.println(result);
	}
}

