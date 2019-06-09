import java.util.ArrayList;
import java.util.List;

public class Solution {

    public void dfs(String str, List<String> list, int left, int right) {
        if (left > right) return;
        if (left > 0) {
            dfs(str + "(", list, left - 1, right);
        }
        if (right > 0) {
            dfs(str + ")", list, left, right - 1);
        }
        if (left == 0 && right == 0) {
            list.add(str);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        dfs("", list, n, n);
        return list;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().generateParenthesis(3));
    }

}
