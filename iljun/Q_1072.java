package iljun;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *  Z가 절대 변하지 않는 경우는 Z가 99%인 경우 -> 100%가 될 수 없기 때문
 */
public class Q_1072 {

    static BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
    static Long X, Y, Z;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        X = Long.parseLong(st.nextToken());
        Y = Long.parseLong(st.nextToken());
        Z = Y * 100 / X;

        if(Z >= 99) {
            System.out.println(-1);
            return;
        }

        long left = 0;
        long right = 1000000000;
        long mid = 0;
        while(left <= right) {
            mid = (left + right) / 2;
            long temp = (Y + mid) * 100 / (X + mid);
            if(temp > Z) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(left);
    }
}
