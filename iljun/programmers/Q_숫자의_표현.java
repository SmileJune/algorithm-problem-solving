package iljun.programmers;

public class Q_숫자의_표현 {
    public int solution(int n) {
        int cnt= 0;
        for(int i = 1; i <= n; i++) {
            for(int j = i; j <= n; j++) {
                int num = sum(i, j);
                if(num == n) {
                    cnt++;
                    continue;
                }

                if(num > n) {
                    break;
                }
            }
        }
        return cnt;
    }

    public int sum(int start, int end) {
        return (start + end) * (end - start + 1) / 2;
    }
}
