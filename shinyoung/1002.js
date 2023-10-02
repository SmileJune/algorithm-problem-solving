/**
 * @param {string} colors
 * @return {boolean}
 */
var winnerOfGame = function(colors) {
    let beforeChar = colors[0];
    let consecutiveCount = 1;
    let [aCount, bCount] = [0, 0];

    for (let i = 1; i < colors.length; i++) {
        if (beforeChar === colors[i]) {
            consecutiveCount += 1;
            if (consecutiveCount >= 3) {
                if (colors[i] === 'A') {
                    aCount += 1;
                } else {
                    bCount += 1;
                }
            }
        } else {
            consecutiveCount = 1;
            beforeChar = colors[i];
        }
    }

    return aCount > bCount ? true : false;
};
