import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> list = new ArrayList<>();
        list.add(label);
        while (label > 0) {
            list.add(0, label / 2);
            label /= 2;
        }
        list.remove(0);
        for (int i = list.size() - 2; i > 0; i = i - 2) {
            list.set(i, (int)(Math.pow(2, i + 1) + Math.pow(2, i) - list.get(i) - 1));
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().pathInZigZagTree(10));
    }
}
