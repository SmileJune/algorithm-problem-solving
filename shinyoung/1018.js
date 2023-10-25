function solution(s) {
    let hash = {};
    let answer = [];
    
    s.split("").map((character, index) => {
        if (hash[character] | hash[character] === 0) {
            answer = [...answer, index - hash[character]];
        } else {
            answer = [...answer, -1];
        }
        
        hash[character] = index;
    });
    
    return answer;
}
