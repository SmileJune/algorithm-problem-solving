/**
 * @param {number} n
 * @param {number[][]} roads
 * @return {number}
 */
var maximalNetworkRank = function (n, roads) {
  let roadsHash = {};

  for (let i = 0; i < n; i++) {
    roadsHash[i] = [];
  }

  function addRoadToHash(node, road) {
    roadsHash[node] = [...roadsHash[node], road];
  }

  roads.map((road) => {
    const [start, end] = road.sort();

    addRoadToHash(start, road);
    addRoadToHash(end, road);
  });

  let answer = 0;

  for (let i = 0; i < n; i++) {
    for (let j = i + 1; j < n; j++) {
      const roadSet = new Set([...roadsHash[i], ...roadsHash[j]]);
      answer = Math.max(answer, roadSet.size);
    }
  }

  return answer;
};
