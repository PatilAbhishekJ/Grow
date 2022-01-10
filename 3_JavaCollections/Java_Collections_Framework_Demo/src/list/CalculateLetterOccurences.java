package list;

import java.util.HashMap;
import java.util.Map;

public class CalculateLetterOccurences {
    public static void main(String[] args) {
        String name = "Mississippi";
        Map<Character, Integer> countMap = new HashMap<Character, Integer>();

        for (char c : name.toCharArray()) {
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }
        }
        for (Map.Entry entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }
}
