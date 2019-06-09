
public class Solution {

    public int mySqrt(int x) {
        int i = 1;
        while (x / i  >= i) {
            i++;
        }
        return i - 1;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().mySqrt(2147395600));
    }

}
