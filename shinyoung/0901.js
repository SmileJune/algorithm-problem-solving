function solution(keymap, targets) {
    const hash = {};
    
    keymap.map(keyboard => {
        for((x) in keyboard) {
            const alphabet = keyboard[x];
            if (hash[alphabet]) {
                hash[alphabet] = Math.min(hash[alphabet], +x + 1);
            } else {
                hash[alphabet] = +x + 1;
            }
        }
    });
    
    const answer = [];
    
    targets.map(target  => {
        let count = 0;
        for (x in target) {
            const alphabet = target[x];
            if (hash[alphabet]) {
                count += hash[alphabet];
            } else {
                count = -1;
                break;
            }
        }
        answer.push(count);
    })
    
    return answer;
}
