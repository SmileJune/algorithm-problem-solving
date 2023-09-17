package iljun.leetcode;

import java.util.*;

public class Q_1 {
    public int[] twoSum(int[] nums, int target) {
        // 원래 배열 유지
        int[] copyNums = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            copyNums[i] = nums[i];
        }

        int start = 0;
        int end = nums.length - 1;
        Arrays.sort(nums);

        int a = 0;
        int b = 0;
        while(start < end) {
            int sum = nums[start] + nums[end];
            if(sum == target) {
                a = nums[start];
                b = nums[end];
                break;
            } else if(sum > target) {
                end--;
            } else {
                start++;
            }
        }

        int[] answer = new int[2];

        System.out.println(a + " " + b);

        for(int i = 0; i < nums.length; i++) {
            if(copyNums[i] == a) {
                answer[0] = i;
                break;
            }
        }

        for(int i = nums.length - 1; i > 0; i--) {
            if(copyNums[i] == b) {
                answer[1] = i;
                break;
            }
        }

        return answer;
    }
}
