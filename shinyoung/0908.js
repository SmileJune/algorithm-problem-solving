var deleteGreatestValue = function(grid) {
    for (let i = 0; i < grid.length; i++) {
        grid[i].sort((a, b) => b - a);
    }

    let array = [...grid[0]];

    for (let i = 0; i < grid.length; i++) {
        for (let j = 0; j < grid[0].length; j++) {
            array[j] = Math.max(array[j], grid[i][j]);
        }
    }

    let answer = 0;
    array.map(x => 
    {
        answer += x;
    })

    return answer;
};
