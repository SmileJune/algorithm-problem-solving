package iljun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_1051 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, M;
    static int[][] map;
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            for(int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        int min = Math.min(N, M);
        for(int i = min; i > 0; i--) {
            for(int j = 0; j < N - i + 1; j++) {
                for(int k = 0; k < M - i + 1; k++) {
                    if(map[j][k] == map[j][k + i - 1] && map[j][k] == map[j + i - 1][k] && map[j][k] == map[j + i - 1][k + i - 1]) {
                        System.out.println(i * i);
                        return;
                    }
                }
            }
        }

    }
}
