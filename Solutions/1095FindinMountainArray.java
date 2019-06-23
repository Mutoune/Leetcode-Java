
public class Solution {
    class MountainArray{
        public int get(int index) {return 0;}
        public int length() {return 0;}
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int top = -1;
        {
            int low = 0, high = n;
            while(high - low > 1){
                int h = high+low-1>>1;
                if(mountainArr.get(h) < mountainArr.get(h+1)){
                    low = h+1;
                }else{
                    high = h+1;
                }
            }
            top = low;
        }
        if(mountainArr.get(top) == target)return top;
        {
            int low = 0, high = top+1;
            while(high - low > 0){
                int h = high+low>>1;
                int v = mountainArr.get(h);
                if(v == target)return h;
                if(v < target){
                    low = h+1;
                }else{
                    high = h;
                }
            }
        }
        {
            int low = top, high = n;
            while(high - low > 0){
                int h = high+low>>1;
                int v = mountainArr.get(h);
                if(v == target)return h;
                if(v > target){
                    low = h+1;
                }else{
                    high = h;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {

    }

}
