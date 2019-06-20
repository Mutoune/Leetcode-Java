
public class Solution {

    boolean isBadVersion(int version) {return true;};
    public int firstBadVersion(int n) {
        int min = 1, max = n;
        while (min < max) {
            int mid = (max - min) / 2 + min;
            if (isBadVersion(mid)) max = mid;
            else min = mid + 1;
        }
        return max;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
