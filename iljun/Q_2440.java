package iljun;

import java.util.Scanner;

public class Q_2440 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i = N; i >= 1; i--) {
            for(int j = 0; j < i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
