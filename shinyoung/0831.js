function solution(n, m, section) {
    let answer = 1;
    let before = section[0];
    
    section.map(x => {
        if (x - before >= m) {
            before = x;
            answer += 1;
        }
    });
    
    return answer;
}