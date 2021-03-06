import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            if (i > 0) {
                for (int j = 1; j < i; j++) {
                    list.add(lists.get(i - 1).get(j - 1) + lists.get(i - 1).get(j));
                }
                list.add(1);
            }
            lists.add(list);
        }
        return lists;
    }
    public static void main(String[] args) {

    }

}
