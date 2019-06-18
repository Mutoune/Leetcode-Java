
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        while (n != 0) {
            if (((n & 1 ) == 1) && ((n >> 1) != 0)) {
                return false;
            }
            n >>= 1;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfTwo(3));
    }
}
