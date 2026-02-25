
package tekPyramidPrograms;

public class WAJP_TO_FETCH_THE_NUMBER {

	public static void main(String[] args) {

		String text = "My age is 32 and my friend age is (34j)";
		char[] charArray = text.toCharArray(); // Convert string to character array
		String number = "";
		boolean insideParentheses = false;

		// Iterate over each character
		for (char ch : charArray) {
			if (ch == '(') {
				insideParentheses = true; // Start extracting after '('
				continue;
			} 
			else if(ch == ')') {
				break; // Stop extracting when ')' is reached
			}
			if (insideParentheses && ch>'0' && ch<'9') {
				number =number+ch; // Append digit characters to number
			}
		}

		if (!number.isEmpty()) {
			System.out.println("Extracted number: " + number);
		} else {
			System.out.println("No number found in parentheses.");
		}				

	}
}

