import java.util.AbstractMap.SimpleEntry;
import java.util.PriorityQueue;

public class Solution {

    public int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) {
        PriorityQueue<SimpleEntry<Integer, Integer>> queue = new PriorityQueue<>((a, b) -> b.getKey() - a.getKey());
        for (int i = 0; i < values.length; i++) {
            queue.add(new SimpleEntry<>(values[i], labels[i]));
        }
        int sum = 0, label[] = new int[20001];
        for (int i = 0; i < num_wanted && !queue.isEmpty(); i++) {
            SimpleEntry<Integer, Integer> entry = queue.poll();
            if (++label[entry.getValue()] <= use_limit) {
                sum += entry.getKey();
            } else {
                i--;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
