import java.util.LinkedList;
import java.util.List;

public class Solution {

    List<Integer> list = new LinkedList<>();
    private void insert(int target) {
        
    }
    public int findKthLargest(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            list.add(Integer.MIN_VALUE);
        }
        for (int i : nums) {
            if (i > list.get(k - 1)) {
                insert(i);
            }
        }
        return list.get(k - 1) == Integer.MIN_VALUE ? -1 : list.get(k - 1);
    }
    public static void main(String[] args) {
        
    }
}
