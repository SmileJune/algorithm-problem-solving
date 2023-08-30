package iljun;

import java.io.BufferedReader;
import java.io.IOException;

public class Q_1075 {
    static int N, F;
    static BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        F = Integer.parseInt(br.readLine());

        N /= 100;
        N *= 100;

        for(int i = 0; i < 100; i++) {
            int result = N + i;
            if(result % F == 0) {
                System.out.printf("%02d", result % 100);
                return;
            }
        }
    }
}
