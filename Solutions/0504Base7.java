
public class Solution {

    public String convertToBase7(int num) {
        if (num == 0) return "0";
        boolean flg = false;
        if (num < 0) {
            num *= -1;
            flg = true;
        }
        StringBuffer sb = new StringBuffer();
        while (num != 0) {
            sb.append(num % 7);
            num /= 7;
        }
        if (flg) sb.append("-");
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(new Solution().convertToBase7(-7));
    }

}
