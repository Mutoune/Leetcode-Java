import java.util.ArrayList;
import java.util.List;

public class Solution {

    private void dfs
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> lists = new ArrayList<>();
        int[] res = new int[n];
        
        for (int i = 0; i < n; i++) {
            if dfs(lists, res, 1, n);
        }
        
        return lists;
    }
    public static void main(String[] args) {
        
    }
}
