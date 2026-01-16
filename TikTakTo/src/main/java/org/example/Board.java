package org.example;
import java.util.ArrayList;
import java.util.List;


public class Board {
    private char[][] grid;

    public Board() {
        grid = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) grid[i][j] = '-';
        }
    }

    public void display() {
        for (char[] row : grid) {
            for (char cell : row) System.out.print(cell + " ");
            System.out.println();
        }
        System.out.println();
    }

    public boolean makeMove(int row, int col, char symbol) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && grid[row][col] == '-') {
            grid[row][col] = symbol;
            return true;
        }
        return false;
    }

    public List<int[]> getEmptyCells() {
        List<int[]> emptyCells = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == '-') emptyCells.add(new int[]{i, j});
            }
        }
        return emptyCells;
    }

    public boolean checkWin(char s) {
        for (int i = 0; i < 3; i++) {
            if ((grid[i][0] == s && grid[i][1] == s && grid[i][2] == s) ||
                    (grid[0][i] == s && grid[1][i] == s && grid[2][i] == s)) return true;
        }
        return (grid[0][0] == s && grid[1][1] == s && grid[2][2] == s) ||
                (grid[0][2] == s && grid[1][1] == s && grid[2][0] == s);
    }

    public boolean isFull() {
        return getEmptyCells().isEmpty();
    }
}