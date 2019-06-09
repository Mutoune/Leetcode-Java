import java.util.Arrays;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        int n2 = 0;
        while (n2 < n) {
            int len = 0;
            if (index >= m) {
                len = n - n2;
                n2 = n;
            } else {
                while (n2 < n && nums2[n2] < nums1[index]) {
                    len++;
                    n2++;
                }
                if (len > 0) {
                    for (int i = m - 1; i >= index; i--) {
                        nums1[i + len] = nums1[i];
                    }
                    m += len;
                }
            }
            if (len != 0) {
                for (int i = index; i <= index + len - 1; i++) {
                    nums1[i] = nums2[n2 - len + i - index];
                }
                index = index + len - 1;
            }
            index++;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = new int[] {9,17,19,0,0,0};
        int[] nums2 = new int[] {2,5,8};
        new Solution().merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

}
