function solution(n, results) {
    // results 배열에서 들어오는 값과 index를 맞추기 위해 불필요한 -1 연산을 하는 
    // array의 크기를 (n + 1) * (n + 1)로 설정
    // 최단 거리를 알고 싶을 때에는 초기값을 MAX_INTEGER로 설정해야 하지만,
    // 단순히 승패 여부만 알면 되기 때문에
    // 모르는 값 0, 승 1, 패 -1 로 설정
let array = Array(n + 1).fill().map(() => new Array(n + 1).fill(0));

    // 이긴 사람은 배열에 1을,
    // 진 사람은 배열에 -1을 표기하기 위해 만든 상수들
const WINNER_MARK = 1;
const LOSER_MARK = -1;

    // array 배열에 승리/패배 매핑
results.map(([winner, loser]) => {
    array[winner][loser] = WINNER_MARK;
    array[loser][winner] = LOSER_MARK;
});

    // 플로이드 워셜 알고리즘 사용
for (let i = 1; i <= n; i++) {
    for (let j = 1; j <= n; j++) {
        for (let k = 1; k <= n; k++) {
    // 의문...?
            const ijResult = array[j][i];
            const jkResult = array[i][k];
            
    // j > i 이고 i > k이면 당연히 j > k이다를 array에 반영
            if (ijResult === WINNER_MARK && jkResult === WINNER_MARK) {
                array[j][k] = WINNER_MARK;
                array[k][j] = LOSER_MARK;
            }
        }
    }
}

    // 배열에서 열 마다 0 개수를 세어 0이 1개 있는 경우에만 answer에 1을 더해준다.
let answer = 0;
for (let i = 1; i <= n; i++) {
    let zeroCount = 0;
    for (let j = 1; j <= n; j++) {
        zeroCount += +(array[i][j] === 0);
    }
    answer += +(zeroCount === 1);
}

return answer;
}
