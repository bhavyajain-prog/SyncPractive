/*
Given a string s, find the length of the longest substring without duplicate characters.
Example: Input: s = "abcabcbb" Output: 3
 */
public class Q4Sol1 {
    public static int longestSubstring(String s) {
        int left = 0, right = 1, n = s.length(), max = 1;
        while (left <= right && right <= n) {
            String sub = s.substring(left, right);
            if (sub.length() > max) max = sub.length();
            if (right < n && sub.contains(s.charAt(right) + "")) {
                left += sub.indexOf(s.charAt(right) + "") + 1;
            } else right++;
        }
        return max;
    }
}
