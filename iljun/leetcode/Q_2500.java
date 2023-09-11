package iljun.leetcode;

import java.util.Arrays;

public class Q_2500 {

    public static void main(String[] args) {
        System.out.println(deleteGreatestValue(new int[][]{{1, 2, 4}, {3, 3, 1}}));
    }
    public static int deleteGreatestValue(int[][] grid) {

        // 오름차순 정렬
        int[][] sorted_grid = new int[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++) {
            int[] arr = grid[i];
            Arrays.sort(arr);
            sorted_grid[i] = arr;
        }

        // reverse matrix
        int[][] reversed_grid = new int[grid[0].length][grid.length];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                reversed_grid[j][i] = grid[i][j];
            }
        }

        // 오름차순 정렬
        int[][] sorted_reversed_grid = new int[reversed_grid.length][reversed_grid[0].length];

        for(int i = 0; i < reversed_grid.length; i++) {
            int[] arr = reversed_grid[i];
            Arrays.sort(arr);
            sorted_reversed_grid[i] = arr;
        }

        int max = 0;
        for(int i = 0; i < reversed_grid.length; i++) {
            max += reversed_grid[i][reversed_grid[i].length - 1];
        }

        return max;
    }
}
