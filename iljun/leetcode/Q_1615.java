package iljun.leetcode;

import java.util.*;

/**
 가장 큰 수 2개 가져와서 확인.
 만약 중복
 연결이 됐는지 안됐는지 확인하는 것 까지 확인
 */
class Q_1615 {
    public int maximalNetworkRank(int n, int[][] roads) {

        List<List<Integer>> lists = new ArrayList();
        boolean[][] visited = new boolean[n][n];

        for(int i = 0; i < n; i++) {
            lists.add(new ArrayList());
        }

        // 그래프
        for(int[] road : roads) {
            lists.get(road[0]).add(road[1]);
            lists.get(road[1]).add(road[0]);
            visited[road[0]][road[1]] = true;
            visited[road[1]][road[0]] = true;
        }

        int answer = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int num = lists.get(i).size() + lists.get(j).size();

                if(visited[i][j]) {
                    num -= 1;
                }

                answer = Math.max(answer, num);
            }
        }

        return answer;

        // // 정렬해서 시간 복잡도를 줄여보자.
        // Map<Integer, Integer> map = new HashMap();
        // for(int i = 0; i < n; i++) {
        //     map.put(i, lists.get(i).size());
        // }

        // List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        // entryList.sort(Map.Entry.comparingByValue());

        // // 가장 큰 것 두 개를 뽑는데 연결 안된 두 쌍이 있을 수 있다.
        // // 연결된 노드인지 안된 노드인지, 가장 큰 노드가 여러 개 있을때... 경우의 수가 많다.
        // // 브루트 포스로 진행했을 때 시간 체크해보자.
        // // 최대 5050개 로드, 5050C2 대충 3천만개 주어진 시간.... 없다.
    }
}