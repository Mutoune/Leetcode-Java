import java.util.Arrays;

public class Solution {

    public double[] sampleStats(int[] count) {
        double min = 256, max = -1, sum = 0, mode = -1, maxMode = -1, len = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                min = Math.min(min, i);
                max = Math.max(max, i);
                if (count[i] > maxMode) {
                    maxMode = count[i];
                    mode = i;
                }
                sum += i * count[i];
                len += count[i];
            }
        }
        if (len == 0) return new double[] {0, 0, 0, 0, 0};
        double[] rtn = new double[5];
        rtn[0] = min;
        rtn[1] = max;
        rtn[2] = sum / len;
        if (len % 2 == 0) {
            double temp = 0;
            boolean flg = false;
            for (int i = 0; i < count.length; i++) {
                temp += count[i];
                if (temp >= len / 2 + 1) {
                    if (flg) rtn[3] = (rtn[3] + i) / 2;
                    else rtn[3] = i;
                    break;
                }
                if (temp >= len / 2) {
                    flg = true;
                    rtn[3] = i;
                }
            }
        } else {
            double temp = 0;
            for (int i = 0; i < count.length; i++) {
                temp += count[i];
                if (temp >= len / 2) {
                    rtn[3] = i;
                    break;
                }
            }
        }
        rtn[4] = mode;
        return rtn;
    }
    

    public static void main(String[] args) {
        int[] count = new int[] {264,912,1416,1903,2515,3080,3598,4099,4757,5270,5748,6451,7074,7367,7847,8653,9318,9601,10481,10787,11563,11869,12278,12939,13737,13909,14621,15264,15833,16562,17135,17491,17982,18731,19127,19579,20524,20941,21347,21800,22342,21567,21063,20683,20204,19818,19351,18971,18496,17974,17677,17034,16701,16223,15671,15167,14718,14552,14061,13448,13199,12539,12265,11912,10931,10947,10516,10177,9582,9102,8699,8091,7864,7330,6915,6492,6013,5513,5140,4701,4111,3725,3321,2947,2357,1988,1535,1124,664,206,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(Arrays.toString(new Solution().sampleStats(count)));
    }

}
