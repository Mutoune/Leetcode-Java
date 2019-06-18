import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) list.add(nums2[i]);
            set.remove(nums2[i]);
        }
        int[] rtn = new int[list.size()];
        for (int i = 0; i < list.size(); i++) rtn[i] = list.get(i);
        return rtn;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
