
public class Solution {

    public String countAndSay(int n) {
        String[] res = new String[30];
        res[0] = "1";
        for (int i = 1; i < n; i++) {
            res[i] = "";
            char target = res[i - 1].charAt(0);
            int temp = 1;
            for (int j = 1; j < res[i - 1].length(); j++) {
                if (res[i - 1].charAt(j) != target) {
                    res[i] += String.valueOf(temp) + String.valueOf(target);
                    target = res[i - 1].charAt(j);
                    temp = 1;
                } else {
                    temp++;
                }
            }
            res[i] += String.valueOf(temp) + String.valueOf(target);
        }
        return res[n-1];
    }
    public static void main(String[] args) {
        System.out.println(new Solution().countAndSay(6));
    }
}
