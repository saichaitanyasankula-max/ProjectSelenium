package tekPyramidPrograms;

import java.util.ArrayList;

public class BalancedString {

	public static void main(String[] args) {

		String s="[]({})"; 

		ArrayList<Character> list=new ArrayList();

		//iterate over the string 3 

		for(int i=0;i<s.length();i++)

		{ 
			//System.out.println(s.length());
			
			char ch=s.charAt(i); 

			if(list.size()>0 && ((ch=='}' && list.get(list.size()-1)=='{') ||
					(ch==']' && list.get(list.size()-1)=='[') || 
					(ch==')' && list.get(list.size()-1)=='(')))
			{
				System.out.println(list.get(list.size()-1));
				list.remove(list.size()-1);
			}else 
			{
				list.add(ch);
				
			}
		}
		if(list.isEmpty()) 
		{ 
			System.out.println("String is balanced");
		}
		else 
			System.out.println("String is not balanced"); 
	}
}



