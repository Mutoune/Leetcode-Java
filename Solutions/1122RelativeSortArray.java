import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], arr2.length - i);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> map.getOrDefault(b, 0) - map.getOrDefault(a, 0) == 0
                ? a - b : map.getOrDefault(b, 0) - map.getOrDefault(a, 0));
        for (Integer i : arr1) {
            queue.add(i);
        }
        int[] rtn = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            rtn[i] = queue.poll();
        }
        return rtn;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
