/*
Given an integer x, return true if x is a palindrome, and false otherwise.
Example: Input: x = 121 Output: true
 */

public class Q2Sol1 {
    public static boolean isPalindrome(int x) {
        int rev = 0;
        int temp = x;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == x;
    }
}
