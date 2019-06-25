
public class Solution {

    public int compress(char[] chars) {
        if (chars.length == 0) return 0;
        int count = 1;
        char target = chars[0];
        int index = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == target) count++;
            else {
                chars[index] = target;
                index++;
                if (count > 1) {
                    String strCount = String.valueOf(count);
                    for (int j = 0; j < strCount.length(); j++) {
                        chars[index] = strCount.charAt(j);
                        index++;
                    }
                }
                count = 1;
                target = chars[i];
            }
        }
        chars[index] = target;
        index++;
        if (count > 1) {
            String strCount = String.valueOf(count);
            for (int j = 0; j < strCount.length(); j++) {
                chars[index] = strCount.charAt(j);
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
