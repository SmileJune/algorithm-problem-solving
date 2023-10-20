/**
 * @param {number[]} arr
 * @return {number}
 */
var longestMountain = function(arr) {
    let answer = 0;

    for (let i = 1; i < arr.length - 1; i++) {
        const top = arr[i];
        let [leftMin, rightMin] = [top, top];
        let tempAnswer = 1;

        for (let j = i - 1; j >= 0; j--) {
            if (arr[j] < leftMin) {
                leftMin = arr[j];
                tempAnswer += 1;
            } else {
                break;
            }
        }

        for (let j = i + 1; j < arr.length; j++) {
            if (arr[j] < rightMin) {
                rightMin = arr[j];
                tempAnswer += 1;
            } else {
                break;
            }
        }

        answer = (leftMin !== top && rightMin !== top) ? Math.max(tempAnswer, answer) : answer;
    }

    return answer;
};
