/**
 * @param {number[][]} mat
 * @return {number}
 */
var diagonalSum = function(mat) {
    let answer = 0;
    for (let i = 0; i < mat.length; i++) {
        answer += i === mat.length - 1 - i ? mat[i][i] : mat[i][i] + mat[i][mat.length - 1 - i];
    }

    return answer;
};
