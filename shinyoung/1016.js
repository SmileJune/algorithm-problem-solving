function solution(N, number) {
    const array = new Array(9).fill().map(() => new Set());
    
    for (let i = 1; i < 9; i++) {
        const repeatedNumber = `${N}`.repeat(i);
        array[i].add(+repeatedNumber);
        
        for (let j = 1; j < i; j++) {
            for (let leftNumber of array[j]) {
                for (let rightNumber of array[i - j]) {
                    array[i].add(leftNumber + rightNumber);
                    array[i].add(leftNumber * rightNumber);
                    array[i].add(leftNumber - rightNumber);
                    rightNumber !== 0 && array[i].add(leftNumber / rightNumber);
                }
            }
        }
        
        if (array[i].has(number)) {
            return i;
        }
    }
    
    return -1;
}
