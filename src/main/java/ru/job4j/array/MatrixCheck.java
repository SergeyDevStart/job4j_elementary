package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 1; index < board[row].length; index++) {
            if (board[row][0] != board[row][index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
