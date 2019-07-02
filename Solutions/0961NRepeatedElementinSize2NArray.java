import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i : A) {
            if (set.contains(i)) {
                return i;
            } else set.add(i);
        }
        return -1;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
