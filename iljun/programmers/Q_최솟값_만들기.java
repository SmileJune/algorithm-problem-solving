package iljun.programmers;

import java.util.*;

public class Q_최솟값_만들기 {
    public int solution(int []A, int []B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for(int i = 0; i < A.length; i++) {
            sum += A[i] * B[A.length - i - 1];
        }

        return sum;
    }
}
