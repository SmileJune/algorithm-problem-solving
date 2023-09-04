function solution(r1, r2) {
    let count = 0;
    
    for (let i = 0; i < r2; i++) {
        count += Math.floor(Math.sqrt(Math.pow(r2, 2) - Math.pow(i, 2)));
    }
    
    for (let i = 0; i < r1; i++) {
        const verticalNumber = Math.sqrt(Math.pow(r1, 2) - Math.pow(i, 2));
        const flooredVerticalNumber = Math.floor(verticalNumber);
        if (verticalNumber === flooredVerticalNumber) {
            count -= flooredVerticalNumber - 1;
        } else {
            count -= flooredVerticalNumber;
        }
    }
    
    count = count * 4;
    
    return count;
}
