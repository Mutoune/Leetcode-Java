
public class Solution {

    public int trailingZeroes(int n) {
        int i = 5;
        int res = 0;
        while (i <= n) {
            res += n / i;
            i *= 5;
        }
        return res;
    }
    public static void main(String[] args) {

    }

}
