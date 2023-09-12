/**
 * @param {number[][]} grid
 * @return {number}
 */

let answer = Number.MAX_VALUE;
const directionArray = [[0, 1], [1, 0]];
let dp;
let xMax;
let yMax;

function dfs(x, y, sum, grid) {
    if (x === xMax && y === yMax) {
        answer = Math.min(answer, sum);
        return;
    }

    for (direction of directionArray) {
        const [xDiff, yDiff] = direction;
        const nextX = x + xDiff;
        const nextY = y + yDiff;

        if (nextX <= xMax && nextY <= yMax && sum + grid[nextX][nextY] < dp[nextX][nextY]) {
            const nextSum = sum + grid[nextX][nextY];
            dp[nextX][nextY] = nextSum;
            dfs(nextX, nextY, nextSum, grid);
        }
    }
}

var minPathSum = function(grid) {
    xMax = grid.length - 1;
    yMax = grid[0].length - 1;

    answer = Number.MAX_VALUE;
    dp = new Array(xMax + 1);
    for (let i = 0; i <= xMax; i++) {
        dp[i] = new Array(yMax + 1).fill(Number.MAX_VALUE);
    }

    dfs(0, 0, grid[0][0], grid);

    return answer;
};
