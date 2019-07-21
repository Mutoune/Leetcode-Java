import java.util.PriorityQueue;

public class Solution {

    public int mctFromLeafValues(int[] arr) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> a - b);
        for (Integer i : arr) heap.add(i);
        int sum = 0;
        int a = heap.poll();
        while (!heap.isEmpty()) {
            int  b = heap.poll();
            sum += a * b;
            a = b;
        }
        return sum;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
