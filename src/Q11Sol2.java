public class Q11Sol2 {
    public static long countOnes(int n) {
        long count = 0;
        int factor = 1;
        while (n / factor > 0) {
            int piche = n / (factor * 10);
            int aage = n % factor;
            int current = (n % (factor * 10)) / factor;

            if (current == 0) count += (long) piche * factor;
            else if (current == 1) count += (long) piche * factor + aage + 1;
            else count += (long) (piche + 1) * factor;

            factor *= 10;
        }
        return count;
    }
}