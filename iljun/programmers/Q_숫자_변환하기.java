package iljun.programmers;

import java.util.*;

public class Q_숫자_변환하기 {
    int[] arr;
    public int solution(int x, int y, int n) {

        arr = new int[1000000 + 1];
        for(int i = 0; i < x; i++) {
            arr[i] = -1;
        }

        arr[x] = 0;

        for(int i = x + 1; i <= y; i++) {
            arr[i] = check(i, x, n);
        }

        return arr[y];
    }

    public int check(int num, int x, int n) {
        int min = Integer.MAX_VALUE;

        // x 보다 크면
        if(num - n >= x && arr[num - n] != -1) {
            min = Math.min(min, arr[num - n] + 1);
        }

        if(num % 2 == 0 && num / 2 >= x && arr[num / 2] != -1) {
            min = Math.min(min, arr[num / 2] + 1);
        }

        if(num % 3 == 0 && num / 3 >= x && arr[num / 3] != -1) {
            min = Math.min(min, arr[num / 3] + 1);
        }

        if(min == Integer.MAX_VALUE) {
            return -1;
        }

        return min;
    }
}
