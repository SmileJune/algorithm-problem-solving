package iljun.leetcode;

import java.util.*;

public class Q_16_2 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while(start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if(diff > Math.abs(sum - target)) {
                    ans = sum;
                    diff = Math.abs(sum - target);
                }

                if(sum > target) {
                    end--;
                    continue;
                }

                start++;
            }
        }
        return ans;
    }
}
