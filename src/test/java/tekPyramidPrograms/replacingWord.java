package tekPyramidPrograms;

public class replacingWord {

	public static void main(String[] args) {
		
		String originalString="ravi is automation enigneer";
		
		String wordtoreplace="is";
		
		String replacementword="an";
		
		//String modifiedstring = originalString.replace(wordtoreplace, replacementword);
		
		String[] words=originalString.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			
			if(words[i].equals(wordtoreplace))
			{
				words[i]=replacementword;
			}
			
		}
		String modifiedstring = String.join(" ", words);
		
		System.out.println(modifiedstring );
	}
}
