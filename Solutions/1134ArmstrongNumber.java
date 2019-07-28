import java.util.ArrayList;
import java.util.List;

public class Solution {

    public boolean isArmstrong(int N) {
        List<Integer> list = new ArrayList<>();
        int temp = N;
        while (temp != 0) {
            list.add(temp % 10);
            temp /= 10;
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += Math.pow(list.get(i), list.size());
            if (sum > N) return false;
        }
        return sum == N ? true : false;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
