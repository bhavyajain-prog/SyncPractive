public class Q6Sol2 {
    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        int m = num1.length();
        int n = num2.length();
//        int res = 0, carry = 0;
//        int pos = 1;
        int[] res = new int[m+n];
        for (int i = m - 1; i >= 0; i--) {
            int dig1 = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int dig2 = num2.charAt(j) - '0';
//                int prod = (dig1 * dig2) + carry;
//                res += (prod % 10) * pos;
//                carry = prod / 10;
                int prod = dig1*dig2; // carry handled in array
                int sum = prod + res[i+j]; // product with any pre carries
                res[i+j+1] = sum%10; // curr digit
                res[i+j] = sum/10; // carry
            }
//            pos *= 10;
        }
        StringBuilder sb = new StringBuilder();
        for (int val : res) {
//            sb.append(val);
            if (val!=0 || !sb.isEmpty()) {
                sb.append(val);
            }
        }
        return sb.toString();
    }
}
