import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    public String[] reorderLogFiles(String[] logs) {
        List<String> list = new ArrayList<>();
        List<String> numList = new ArrayList<>();
        String[] rtn = new String[logs.length];
        for (int i = 0; i < logs.length; i++) {
            int start = logs[i].indexOf(" ") + 1;
            if (logs[i].charAt(start) <= '9') {
                numList.add(logs[i]);
            } else {
                list.add(logs[i].substring(start, logs[i].length()) + " "
                        +logs[i].substring(0, start - 1));
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            int start = list.get(i).lastIndexOf(" ");
            rtn[i] = list.get(i).substring(start + 1, list.get(i).length()) + " " + list.get(i).substring(0, start);
        }
        for (int i = list.size(); i < list.size() + numList.size(); i++) {
            rtn[i] = numList.get(i - list.size());
        }
        return rtn;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] s = new String[] {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
//        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(new Solution().reorderLogFiles(s)));
    }

}
