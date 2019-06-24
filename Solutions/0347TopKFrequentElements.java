import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class Solution {

    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Entry<Integer, Integer>> queue = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        List<Integer> list = new ArrayList<>();
        for (Integer i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            queue.add(entry);
        }
        int i = 0;
        while (!queue.isEmpty() && i < k) {
            list.add(queue.poll().getKey());
            i++;
        }
        return list;
    }
    public static void main(String[] args) {

    }

}
