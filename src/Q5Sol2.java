public class Q5Sol2 {
    public static int needleInHay(String haystack, String needle) {
        int size = needle.length();
        for (int i = 0; i < haystack.length() - size; i++) {
            if (haystack.substring(i, i + size).equals(needle)) return i;
        }
        return -1;
    }
}
