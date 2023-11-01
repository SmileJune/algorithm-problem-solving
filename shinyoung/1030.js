function solution(n, computers) {
    let answer = 0;
		// 방문 배열 생성
    let visited = Array(computers.length).fill(false);
    
    function dfs(currentPosition) {
        visited[currentPosition] = true;
        
		// 방문한 적 없고, 현재 위치와 직접적으로 연결된 노드를 다음에 방문
        for (let i = 0; i < computers.length; i++) {
            if (!visited[i] && computers[currentPosition][i]) {
                dfs(i);
            }
        }
    }
    
		// answer 개수 구하기
		// 노드마다 dfs를 돌리며 answer + 1
		// 단, 이전 노드를 통해 방문한 적이 없어야 함.
    for (let i = 0; i < computers.length; i++) {
        if (!visited[i]) {
            dfs(i);
            answer += 1;
        }
    }
    
    return answer;
}
