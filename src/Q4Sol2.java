import java.util.HashSet;
import java.util.Set;

public class Q4Sol2 {
    public static int longestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 1, n = s.length(), max = 1;
        set.add(s.charAt(left));
        while (right < n) {
            char c = s.charAt(right);
            if (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            } else {
                max = Math.max(max, right - left + 1);
                set.add(c);
                right++;
            }
        }
        return max;
    }
}
