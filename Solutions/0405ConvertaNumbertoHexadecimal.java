
public class Solution {

    public String toHex(int num) {
        if (num == 0) return "0";
        long target = num;
        if (target < 0) target = Long.parseLong("4294967296") + target;
        StringBuffer sb = new StringBuffer();
        while (target != 0) {
            if (target % 16 < 10) {
                sb.append(target % 16);
            } else {
                sb.append((char)(target % 16 - 10 + 'a'));
            }
            target = target / 16;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(new Solution().toHex(-1));
    }

}
