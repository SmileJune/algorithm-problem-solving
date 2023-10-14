package iljun.programmers;

import java.util.*;

public class Q_두_원_사이의_정수_쌍 {
    public long solution(int r1, int r2) {
        // 1부터 r2까지 판단하고 * 4
        // 1 ~ r1이 있는 곳까지는 (int)f2(i) - (int)f1(i) -> f1(r1)가 정수에 딱 맞을때를 고려해 + (int)f1(r1) / f1(r1) 해줌.
        // r1 + 1 ~ r2 까지는 (int)f2(i)
        // (r1,0) ... (r2,0) 좌표 값은 항상 존재하지만 계산이 되지 않기 때문에 + (r2 - r1 + 1) 해준다.
        long answer = 0;

        for(int x = 1; x <= r1 - 1; x++) {
            answer += ((int)y(r2, x) - (int)y(r1, x));
            answer += (int)y(r1, x) / y(r1, x);
        }

        for(int x = r1; x <= r2 - 1; x++) {
            answer += (int)y(r2, x);
        }

        answer += (r2 - r1 + 1);

        return answer * 4;
    }

    public double y(int r, int x) {
        return Math.sqrt(Math.pow(r, 2) - Math.pow(x, 2));
    }
}
