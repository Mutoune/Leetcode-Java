import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    private boolean checkFrom(char[][] board, short[][] map, int x, int y, String word) {
        if (word.equals("")) return true;
        if (x - 1 >= 0 && map[x - 1][y] == 0 && board[x - 1][y] == word.charAt(0)) {
            map[x - 1][y] = 1;
            if (checkFrom(board, map, x - 1, y, word.substring(1, word.length()))) return true;
            else map[x - 1][y] = 0;
        }
        if (x + 1 < board.length && map[x + 1][y] == 0 &&  board[x + 1][y] == word.charAt(0)) {
            map[x + 1][y] = 1;
            if (checkFrom(board, map, x + 1, y, word.substring(1, word.length()))) return true;
            else map[x + 1][y] = 0;
        }
        if (y - 1 >= 0 && map[x][y - 1] == 0 && board[x][y - 1] == word.charAt(0)) {
            map[x][y - 1] = 1;
            if (checkFrom(board, map, x, y - 1, word.substring(1, word.length()))) return true;
            else map[x][y - 1] = 0;
        }
        if (y + 1 < board[0].length && map[x][y + 1] == 0 && board[x][y + 1] == word.charAt(0)) {
            map[x][y + 1] = 1;
            if (checkFrom(board, map, x, y + 1, word.substring(1, word.length()))) return true;
            else map[x][y + 1] = 0;
        }
        return false;
    }
    private boolean check(char[][] board, String word) {
        if (board.length == 0 || board[0].length == 0 || board.length * board[0].length < word.length()) return false;
        short[][] map = new short[board.length][board[0].length];
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    map[i][j] = 1;
                    if (checkFrom(board, map, i, j, word.substring(1, word.length()))) return true;
                    else map[i][j] = 0;
                }
            }
        return false;
    }
    public List<String> findWords(char[][] board, String[] words) {
        List<String> list = new ArrayList<>();
        for (String str : words) {
            if (check(board, str)) list.add(str);
        }
        return list;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
