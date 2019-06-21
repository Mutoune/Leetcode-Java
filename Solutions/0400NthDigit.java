
public class Solution {

    public int findNthDigit(int m) {
        long i = 1;
        int count = 1;
        long n = m;
        while (n - i * 9 * count > 0) {
            n -= i* 9 * count;
            i *= 10;
            count++;
        }
        long target = n / count + i;
        int mod = (int) (n % count);
        if (mod == 0) {
            target--;
            mod = count;
        }
        return Integer.parseInt(String.valueOf(target).substring(mod - 1, mod));
    }
    public static void main(String[] args) {
        System.out.println(new Solution().findNthDigit(2147483647));
    }

}
