package iljun.leetcode;

import java.util.*;

public class Q_16 {
    int ans = Integer.MAX_VALUE;
    int diff = Integer.MAX_VALUE;
    public int threeSumClosest(int[] nums, int target) {
        boolean[] visited = new boolean[nums.length];
        comb(nums, visited, 0, nums.length, 3, target);
        return ans;
    }

    public void comb(int[] nums, boolean[] visited, int start, int n, int r, int target) {
        if(r == 0) {
            // 로직 체크
            int sum = 0;
            for(int i = 0; i < visited.length; i++) {
                if(visited[i]) {
                    sum += nums[i];
                }
            }

            if(diff < Math.abs(sum - target)){
                return;
            }

            diff = Math.abs(sum - target);
            ans = sum;
            return;
        }

        for(int i = start; i < n; i++) {
            visited[i] = true;
            comb(nums, visited, i + 1, n, r - 1, target);
            visited[i] = false;
        }
    }
}
