
function solution(numbers, target) {
    const numbersLength = numbers.length;
    let answer = 0;
    
    function dfs(index, sum) {
        if (index === numbersLength) {
            if (sum === target) {
                answer += 1;
            }
            
            return;
        }
        
        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]);
    }
    
    dfs(0, 0);
    
    return answer;
}
