package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharCountInWord {
    public static void main(String[] args) {

        String word = "facebook";
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        char []arr = word.toCharArray();

        for (char c : arr) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }


        System.out.println(charCount);

    }
}
