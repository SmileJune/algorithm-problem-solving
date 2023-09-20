/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
let answer = [];

function dfs(index, totalArray, target, candidates) {
    const totalArraySum = totalArray.reduce((acc, current) => {
        return acc + current;
    }, 0);

    if (totalArraySum === target) {
        answer.push(totalArray);
        return;
    }

    if (totalArraySum > target) {
        return;
    }

    for (let i = index; i < candidates.length; i++) {
        dfs(i, [...totalArray, candidates[i]], target, candidates);
    }
}


var combinationSum = function(candidates, target) {
    answer = [];
    
    for (let i = 0; i < candidates.length; i++) {
        dfs(i, [candidates[i]], target, candidates);
    }

    return answer;
};
