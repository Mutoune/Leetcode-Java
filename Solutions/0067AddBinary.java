
public class Solution {

    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int lena = a.length() - 1;
        int lenb = b.length() - 1;
        int carry = 0;
        while (lena >=0 || lenb >= 0) {
            int sum = carry;
            if (lena >= 0) sum += a.charAt(lena--) - '0';
            if (lenb >= 0) sum += b.charAt(lenb--) - '0';
            carry = sum / 2;
            sb.append(sum % 2);
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().addBinary("1111", "1111"));
    }

}
