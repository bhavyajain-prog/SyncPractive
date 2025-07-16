/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack. (Easy)
Example: Input: haystack = "sadbutsad", needle = "sad" Output: 0
 */
public class Q5Sol1 {
    public static int needleInHay(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
