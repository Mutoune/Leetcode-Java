import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public int[][] highFive(int[][] items) {
        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        for (int i = 0; i < items.length; i++) {
            if (map.containsKey(items[i][0])) {
                map.get(items[i][0]).add(items[i][1]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(items[i][1]);
                map.put(items[i][0], list);
            }
        }
        int[] temp = new int[1001];
        for (int i = 0; i < 1001; i++) temp[i] = -1; 
        for (Integer i : map.keySet()) {
            Collections.sort(map.get(i));
            int sum = 0;
            for (int j = 1; j < 6; j++) {
                sum += map.get(i).get(map.get(i).size() - j);
            }
            temp[i] = sum / 5;
        }
        int[][] rtn = new int[map.size()][2];
        int index = 0;
        for (int i = 1; i < 1001; i++) {
            if (temp[i] != -1) {
                rtn[index][0] = i;
                rtn[index][1] = temp[i];
                index++;
            }
        }
        return rtn;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
