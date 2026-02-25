package tekPyramidPrograms;

public class Swapping_first_and_last_word {
	
    public static void main(String[] args) {
    	
        String input = "Hello World Java Programming";

        // Swap first and last word
        String[] words = input.split(" ");
        
        String temp = words[0];
        
        words[0] = words[words.length - 1];
        
        words[words.length - 1] = temp;

        String output = "";
        
        for (String word : words) {
            output = output+word + " ";
       }
        
        System.out.println("Swapped first and last word:");
        System.out.println(output.trim());
        
    }
}

