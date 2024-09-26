import java.util.HashMap;
import java.util.*;

public class Group_Anagram {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();
            for (String word : strs) {
                char[] ch = word.toCharArray();
                Arrays.sort(ch);
                String s = new String(ch);
                if (!map.containsKey(s)) {
                    map.put(s, new ArrayList<>());
                }            
                map.get(s).add(word);
            }
            return new ArrayList<>(map.values());
        }
    }
}
