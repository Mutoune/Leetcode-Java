
public class Solution {

    public int countSegments(String s) {
        if (s.length() == 0) return 0;
        String[] list = s.split(" ");
        int rtn = list.length;
        for (String str : list) {
            str.trim();
            if (str.equals("")) {
                rtn--;
            }
        }
        return rtn;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
