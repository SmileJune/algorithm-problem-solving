function solution(n, edge) {
    const visited = new Array(n + 1).fill(false);
    const level = new Array(n + 1).fill(0);
    const queue = [1];
    visited[1] = true;
    
    while (queue.length) {
        const current = queue.shift();
        const currentLevel = level[current] + 1;
        for (let node of edge) {
            if (node[0] === current && !visited[node[1]]) {
                queue.push(node[1]);
                visited[node[1]] = true;
                level[node[1]] = currentLevel;
            } else if (node[1] === current && !visited[node[0]]) {
                queue.push(node[0]);
                visited[node[0]] = true;
                level[node[0]] = currentLevel;
            }
        }
    }
    
    let maxValue = 0;
    let hash = {};
    level.map((value) => {
        maxValue = Math.max(maxValue, value);
        if (hash[value]) {
            hash[value] += 1;
        } else {
            hash[value] = 1;
        }
    })
    
    return hash[maxValue];
}
