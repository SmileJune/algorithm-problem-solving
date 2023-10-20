package iljun.programmers;

import java.util.*;

public class Q_귤_고르기 {
    public int solution(int k, int[] tangerine) {
        // 각 숫자마자 수를 파악하고 많은 것부터 넣는다.
        // k -= (넣은 숫자), ans++
        // k <= 0 이 될 때 ans 리턴
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList, (o1, o2) -> o2.getValue() - o1.getValue());

        int answer = 0;
        while(k > 0) {
            for(Map.Entry<Integer, Integer> entry : entryList) {
                k -= entry.getValue();
                answer++;
            }
        }
        return answer;
    }
}
