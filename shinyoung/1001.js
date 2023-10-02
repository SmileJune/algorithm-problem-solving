/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    const array = s.split(" ");
    let answer = "";
    for (let i = 0; i < array.length; i++) {
        const string = array[i];
        answer += i !== array.length - 1 ? string.split("").reverse().join("") + " "
        : string.split("").reverse().join("");
    }

    return answer;
};
