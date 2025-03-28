package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] words = text.split(" ");

        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            Integer count = result.get(word);
            if(count == null){
                count = 0;
            }
            count++;

            result.put(word, count);
        }

        System.out.println(result);
    }
}
