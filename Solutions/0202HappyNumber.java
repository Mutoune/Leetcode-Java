import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        while(n != 1) {
            int temp = 0;
            while (n != 0) {
                temp += (n % 10) * (n % 10);
                n /= 10;
            }
            n = temp;
            if (set.contains(n)) return false;
            set.add(n);
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
