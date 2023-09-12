package iljun.leetcode;

public class Q_64 {
    public int minPathSum(int[][] grid) {
        int[][] result = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {

                if(i == 0 && j == 0) {
                    result[0][0] = grid[0][0];
                    continue;
                }

                if(i == 0) {
                    result[i][j] = result[0][j - 1] + grid[i][j];
                    continue;
                }

                if(j == 0) {
                    result[i][j] = result[i - 1][0] + grid[i][j];
                    continue;
                }

                result[i][j] = Math.min(result[i - 1][j], result[i][j - 1]) + grid[i][j];
            }
        }
        return result[grid.length - 1][grid[0].length - 1];
    }
}
