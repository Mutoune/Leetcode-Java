import java.util.ArrayList;
import java.util.List;

public class Solution {

    private boolean ok(int i) {
        int temp = i;
        while (temp != 0) {
            if (temp % 10 == 0 || i % (temp % 10) != 0) return false;
            temp = temp / 10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (ok(i)) list.add(i);
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().selfDividingNumbers(1, 22));
    }

}
