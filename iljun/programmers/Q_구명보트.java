package iljun.programmers;

import java.util.*;

public class Q_구명보트 {
    public int solution(int[] people, int limit) {

        //정렬하고 가장 무거운 친구 + 가장 가벼운 친구 확인. 인덱스로 start, end 움직이면서 다 탈때까지 확인
        Arrays.sort(people);
        int start = 0;
        int end = people.length - 1;

        int answer = 0;
        while(start <= end) {
            if(people[start] + people[end] <= limit) {
                start++;
                end--;
            } else {
                end--;
            }
            answer++;
        }

        return answer;
    }
}
