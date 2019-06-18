import java.util.ArrayList;
import java.util.List;

public class Solution {

    private int directX = 1;
    private int directY = 1;
    private int index = 0;
    
    private void doWithX(List<Integer> list, int x, int y, int[][] ma) {
        while (x >= 0 && x < ma.length && ma[x][y] != Integer.MAX_VALUE) {
            list.add(ma[x][y]);
            ma[x][y] = Integer.MAX_VALUE;
            index++;
            x += directX;
        }
        x -= directX;
        directX = directX * -1;
        if (index < ma.length * ma[0].length)
            doWithY(list, x, y + directY, ma);
    }
    private void doWithY(List<Integer> list, int x, int y, int[][] ma) {
        while (y >= 0 && y < ma[x].length && ma[x][y] != Integer.MAX_VALUE) {
            list.add(ma[x][y]);
            ma[x][y] = Integer.MAX_VALUE;
            index++;
            y += directY;
        }
        y -= directY;
        directY = directY * -1;
        if (index < ma.length * ma[0].length)
            doWithX(list, x + directX, y, ma);
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0) return list;
        doWithY(list, 0, 0, matrix);
        return list;
    }
    public static void main(String[] args) {
        int[][] matrix = new int[][] {{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }};
        System.out.println(new Solution().spiralOrder(matrix));
    }

}
