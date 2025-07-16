/*
Given an integer x, return true if x is a palindrome, and false otherwise.
Example: Input: x = 121 Output: true
 */

public class Q2Sol2 {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x % 10 == x) return true;

        StringBuilder sb = new StringBuilder((x + ""));
        int rev = Integer.parseInt(sb.reverse().toString());
        return rev == x;
    }
}
