
public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int index1 = (nums1.length + nums2.length) / 2 + 1;
        int index2 = (nums1.length + nums2.length) % 2 == 1 ? -1 : (nums1.length + nums2.length) / 2;
        int i = 0, j = 0, count = 0;
        int target1 = 0, target2 = 0;
        while (count < index1) {
            int target = 0;
            if (i == nums1.length) {
                target = nums2[j];
                j++;
            }
            else if (j == nums2.length) {
                target = nums1[i];
                i++;
            }
            else {
                if (nums1[i] < nums2[j]) {
                    target = nums1[i];
                    i++;
                } else {
                    target = nums2[j];
                    j++;
                }
            }
            count++;
            if (index2 > 0 && count == index2) {
                target2 = target;
            }
            if (count == index1) {
                target1 = target;
            }
        }
        System.out.println(target1);
        System.out.println(target2);
        return index2 == -1 ? (double)target1 : (double)(target1 + target2) / 2;
    }
    public static void main(String[] args) {
        int[] nums1 = new int[] {1, 3};
        int[] nums2 = new int[] {2};
        System.out.println(new Solution().findMedianSortedArrays(nums1, nums2));
    }

}
