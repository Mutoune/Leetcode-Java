
public class Solution {

    public int getSum(int a, int b) {
        while (b != 0) {
            int temp = a & b;
            a = a ^ b;
            b = temp << 1;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().getSum(-1, 3));
    }

}
