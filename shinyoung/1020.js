function solution(m, n, puddles) {
    let array = Array(m + 1).fill().map(() => Array(n + 1).fill(0));
    puddles.map(([x, y]) => array[x][y] = -1);
    array[1][1] = 1;
    const divider = 1000000007;
    
    for (let i = 2; i < Math.max(m, n) + 1; i++) {
        if (i <= m) {
            if (array[i][1] !== -1 && array[i - 1][1] !== -1) {
                array[i][1] = array[i - 1][1];
            } else {
                array[i][1] = -1;
            }
        }
        
        if (i <= n) {
            if (array[1][i] !== -1 && array[1][i] !== -1) {
                array[1][i] = array[1][i - 1];
            } else {
                array[1][i] = -1;
            }
        }
    }
    
    for (let i = 2; i <= m; i++) {
        for (let j = 2; j <= n; j++) {
            if (array[i][j] === -1) {
                continue;
            }
            
            let value = (array[i - 1][j] === -1 & array[i][j - 1] === -1) ? -1 : 0;
            value += array[i - 1][j] !== -1 ? array[i - 1][j] % divider: 0;
            value += array[i][j - 1] !== -1 ? array[i][j - 1] % divider: 0;
            array[i][j] = value;
        }
    }
    
    return array[m][n] === -1 ? 0 : array[m][n] % divider;
}
