/*
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
Example: Input: num1 = "2", num2 = "3" Output: "6"
 */
public class Q6Sol1 {
    public static String multiply(String num1, String num2) {
        return (Integer.parseInt(num1) * Integer.parseInt(num2)) + "";
    }
}
