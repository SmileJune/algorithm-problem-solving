function solution(board, skill) {
  const accumulateSumArray = Array(board.length)
    .fill()
    .map(() => new Array(board[0].length).fill(0));

  skill.map((x) => {
    const [type, r1, c1, r2, c2, degree] = x;
    const value = type === 1 ? -1 * degree : degree;
    accumulateSumArray[r1][c1] += value;
    if (c2 + 1 < board[0].length) {
      accumulateSumArray[r1][c2 + 1] -= value;
    }

    if (r2 + 1 < board.length) {
      accumulateSumArray[r2 + 1][c1] -= value;
    }

    if ((c2 + 1 < board[0].length) & (r2 + 1 < board.length)) {
      accumulateSumArray[r2 + 1][c2 + 1] += value;
    }
  });

  for (let i = 1; i < board.length; i++) {
    accumulateSumArray[i][0] += accumulateSumArray[i - 1][0];
  }

  for (let i = 1; i < board[0].length; i++) {
    accumulateSumArray[0][i] += accumulateSumArray[0][i - 1];
  }

  for (let i = 1; i < board.length; i++) {
    for (let j = 1; j < board[0].length; j++) {
      accumulateSumArray[i][j] +=
        accumulateSumArray[i - 1][j] +
        accumulateSumArray[i][j - 1] -
        accumulateSumArray[i - 1][j - 1];
    }
  }

  let count = 0;

  for (let i = 0; i < board.length; i++) {
    for (let j = 0; j < board[0].length; j++) {
      if (board[i][j] + accumulateSumArray[i][j] > 0) {
        count += 1;
      }
    }
  }

  return count;
}
