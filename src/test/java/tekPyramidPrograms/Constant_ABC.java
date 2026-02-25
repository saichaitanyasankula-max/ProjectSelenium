package tekPyramidPrograms;

import java.util.ArrayList;
import java.util.List;

public class Constant_ABC {

    public static void main(String[] args) {
       
        String constantPart = "xyz";
        String variablePart = "ABC";

      char ch[]=variablePart.toCharArray();
      
        List<String> combinations = new ArrayList();
        
        System.out.println(variablePart.length());
        
        for (int i = 0; i < ch.length; i++) {
        	
            for (int j = 0; j < ch.length; j++) {
            	
                for (int k = 0; k < ch.length; k++) {
                	
                    if (i != j && i != k && j != k) {
                        
                        String combination = "" + ch[i] + ch[j] + ch[k];
                        
                        combinations.add(combination.toLowerCase() + " " + constantPart);
                    }
                    
                }
                
            }
            
        }
        for (String comb : combinations) {
        	
        	System.out.println(comb);
        }
    }
}