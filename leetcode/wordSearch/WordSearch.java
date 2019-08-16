package wordSearch;

// https://leetcode.com/problems/word-search/
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean res = findWord(board, i, j, 0, word);
                if (res) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean findWord(char[][] board, int i, int j, int idx, String pattern) {
        if (idx == pattern.length()) return true;
        if ((i < 0 || i >= board.length) || (j < 0 || j >= board[0].length)) return false;  // if i or j out of matrix range
        if (board[i][j] != pattern.charAt(idx)) return false;
        char temp = board[i][j];
        board[i][j] = '#';  // mark the cell as visited

        boolean r = findWord(board, i, j-1, idx+1, pattern) ||
                    findWord(board, i, j+1, idx+1, pattern) ||
                    findWord(board, i-1, j, idx+1, pattern) ||
                    findWord(board, i+1, j, idx+1, pattern);

        if (!r) board[i][j] = temp;
        return r;
    }
}
