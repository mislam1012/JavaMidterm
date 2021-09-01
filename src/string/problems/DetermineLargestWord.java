package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below
         Should return "10 biological"
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);


    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";

        String[] words = wordGiven.split(" ");
        int length = 0;
         
        for(String word:words){
            if(length < word.length()){
                st = word;
                length = word.length();
            }
        }
        
        map[length] = word;
        return map;
        

        return map;
    }
}
