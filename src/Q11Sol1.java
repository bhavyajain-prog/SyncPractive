/*
Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
 */
public class Q11Sol1 {
    public static long countOnes(int n) {
        long count = 0;
        long factor = 1;

        for (int i = 0; i <= n; i++) {
            String num = i + "";
            for (char c : num.toCharArray()) count += (c == '1' ? 1 : 0);
        }

        return count;
    }
}
