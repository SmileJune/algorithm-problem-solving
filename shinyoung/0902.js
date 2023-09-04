function solution(targets) {
    targets.sort((a, b) => {
        if (a[1] === b[1]) {
            return a[0] - b[0];
        }
        return b[1] - a[1];
    });
    
    let answer = 1;
    let start = targets[0][0];
    
    for (let i = 1; i < targets.length; i++) {
        const [left, right] = targets[i];
        if (right <= start) {
            answer += 1;
            start = left;
        } else {
            if (left > start) {
                start = left;
            }
        }
    }
    
    return answer;
}
