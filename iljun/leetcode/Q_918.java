package iljun.leetcode;

import java.util.*;

/**
 부분합을 한바퀴 돌릴 수 있도록 크기가 2배인 배열을 준비해두고
 판단을 i = 0 부터 시작하는데 i + n 보다 전까지 판단한다. 같은 값이 두번 들어갈 수 없기 때문에
 만약 length - 1 판단은 length -1 + n 까지 판단.
 매 판단마다 최댓값과 비교해서 갱신
 */
class Q_918 {
    public int maxSubarraySumCircular(int[] nums) {

        int[] sumFromFirstIndex = new int[nums.length * 2];
        sumFromFirstIndex[0] = nums[0];
        for(int i = 1; i < sumFromFirstIndex.length; i++) {
            sumFromFirstIndex[i] = sumFromFirstIndex[i - 1] + nums[i % nums.length];
        }

        int answer = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            answer = Math.max(answer, sumFromFirstIndex[i]);
            for(int j = i + 1; j < i + nums.length; j++) {
                int sum = sumFromFirstIndex[j] - sumFromFirstIndex[i];
                answer = Math.max(answer, sum);
            }
        }

        return answer;
    }
}