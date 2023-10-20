/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function(s, numRows) {
    if (numRows === 1) {
        return s;
    }

    let answer = [];

    for (let i = 1; i <= numRows; i++) {
        let index = i - 1;
        answer = [...answer, s[index]];
        while (index < s.length) {
            let nextIndexAdd = (numRows - i) * 2;
            index += nextIndexAdd;
            if (nextIndexAdd && index < s.length) {
                answer = [...answer, s[index]];
            }

            nextIndexAdd = (i - 1) * 2;
                index += nextIndexAdd;
            if (nextIndexAdd && index < s.length) {
                answer = [...answer, s[index]];
            }
        }
    }  

    return answer.join('');
};
