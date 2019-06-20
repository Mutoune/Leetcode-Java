
public class Solution {

    public String addStrings(String num1, String num2) {
        int index = 0;
        StringBuffer sb = new StringBuffer();
        int flg = 0;
        while (index < num1.length() || index < num2.length()) {
            int a = index < num1.length() ? num1.charAt(num1.length() - index - 1) - '0' : 0;
            int b = index < num2.length() ? num2.charAt(num2.length() - index - 1) - '0' : 0;
            sb.append((a + b + flg) % 10);
            flg = (a + b + flg) / 10;
            index++;
        }
        if (flg > 0) sb.append(flg);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(new Solution().addStrings("50", "9999"));
    }

}
