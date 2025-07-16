import java.util.*;

/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
Example: Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */
public class Q10Sol1 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> value = map.getOrDefault(key, new ArrayList<>());
            value.add(s);
            map.put(key,value);
        }
        return map.values().stream().toList();
    }
}
