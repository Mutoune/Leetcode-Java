import java.util.ArrayList;
import java.util.List;

public class Solution {

    public String convert(String s, int numRows) {
        List<List<String>> rows = new ArrayList<>();
        int row = 0;
        int de = -1;
        String rtn = "";
        for (int i = 0; i < s.length(); i++) {
            if (i < numRows) {
                rows.add(new ArrayList<String>());
            }
            rows.get(row).add(s.substring(i, i + 1));
            if (row == 0 || row == numRows - 1) {
                de = de * -1;
            }
            if (numRows != 1) row = row + de;
        }
        for (int i = 0; i < rows.size(); i++) {
            for (int j = 0; j < rows.get(i).size(); j++) {
                rtn += rows.get(i).get(j);
            }
        }
        return rtn;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().convert("AB", 1));
    }

}
