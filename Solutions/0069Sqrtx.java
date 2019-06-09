
public class Solution {

    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (x / mid < mid) {
                right = mid;
            } else {
                if (x / (mid + 1) < (mid + 1)) {
                    return mid;
                }
                left = mid + 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().mySqrt(2147395600));
    }

}
