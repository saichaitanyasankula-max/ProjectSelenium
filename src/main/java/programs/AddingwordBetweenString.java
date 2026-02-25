package programs;

public class AddingwordBetweenString {

	public static void main(String[] args) {
		
		String s="Once upon time";
		
		String op=" ";
		
		String[] str=s.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			
			String temp=str[i];
			
			if(temp.equals("upon"))
			{
				op=temp+" a";
			}
			else
			{
				op=temp;
			}
			System.out.println(op);
		}
		
		
	}
}
