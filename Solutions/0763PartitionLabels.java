import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    public List<Integer> partitionLabels(String S) {
        List<Integer> list = new ArrayList<>();
        int left = 0, right = 0;
        while (right < S.length()) {
            int target = left;
            while (target <= right) { 
                int index = S.substring(right + 1, S.length()).lastIndexOf(S.charAt(target));
                if (index != -1) right += index + 1;
                target++;
            }
            list.add(right - left + 1);
            right++;
            left = right;
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().partitionLabels(""));
    }

}
