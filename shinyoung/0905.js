function solution(n) {
    const three = n.toString(3);
    const stringThree = three.toString();
    const reversedStringThree = stringThree.split("").reverse().join("");
    let answer = 0;
    
    for (let i = 0; i < reversedStringThree.length; i++) {
        answer += reversedStringThree[i] * Math.pow(3, reversedStringThree.length - 1 - i);
    }
    
    return answer;
}
