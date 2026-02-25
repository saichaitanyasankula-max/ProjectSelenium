package tekPyramidPrograms;

import java.util.HashMap;

public class UniqueWordsOneLoop {
    public static void main(String[] args) {
   
        String str = "hai hello how are you are";
        
        String[] words = str.split(" ");
        
        HashMap<String, Integer> map = new HashMap<>();

        // One for-loop to count and decide uniqueness at last occurrence
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            map.put(word, map.getOrDefault(word, 0) + 1);

            // At last occurrence and unique
 //           if (i == lastIndex(words, word) && map.get(word) == 1) {
                System.out.println(word + " 1");
            }
        }
    }

//}
