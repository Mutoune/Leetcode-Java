import java.util.ArrayList;
import java.util.List;

public class Solution {

    StringBuffer temp = new StringBuffer();
    private boolean ok(List<String> list, int x, int y) {
        int j = 1;
        for (int i = x - 1; i >= 0; i--) {
            if (y - j >= 0 && list.get(i).charAt(y - j) == 'Q') return false;
            if (y + j < list.size() && list.get(i).charAt(y + j) == 'Q') return false;
            if (list.get(i).charAt(y) == 'Q') return false;
            j++;
        }
        return true;
    }
    private void dfs(List<List<String>> lists, List<String> list, int level) {
        if (level == list.size()) {
            List<String> res = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) res.add(list.get(i));
            lists.add(res);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (ok(list, level, i)) {
                StringBuffer line = new StringBuffer();
                int j;
                for (j = 0; j < i; j++) line.append('.');
                line.append('Q');
                j++;
                for (;j < list.size(); j++) line.append('.');
                list.set(level, line.toString());
                dfs(lists, list, level + 1);
                list.set(level, temp.toString());
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> lists = new ArrayList<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) temp.append('.');
        for (int i = 0; i < n; i++) list.add(temp.toString());
        dfs(lists, list, 0);
        return lists;
    }
    
    public static void main(String[] args) {
        System.out.println(new Solution().solveNQueens(0));
    }
}
