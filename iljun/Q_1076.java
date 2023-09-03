package iljun;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q_1076 {

    static Map<String, Long> value = new HashMap<>();
    static Map<String, Long> mul = new HashMap<>();
    static Long result;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        value.put("black", 0L);
        value.put("brown", 1L);
        value.put("red", 2L);
        value.put("orange", 3L);
        value.put("yellow", 4L);
        value.put("green", 5L);
        value.put("blue", 6L);
        value.put("violet", 7L);
        value.put("grey", 8L);
        value.put("white", 9L);

        mul.put("black", 1L);
        mul.put("brown", 10L);
        mul.put("red", 100L);
        mul.put("orange", 1000L);
        mul.put("yellow", 10000L);
        mul.put("green", 100000L);
        mul.put("blue", 1000000L);
        mul.put("violet", 10000000L);
        mul.put("grey", 100000000L);
        mul.put("white", 1000000000L);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 3; i++) {
            String color = sc.nextLine();

            if(i == 2) {
                result = Integer.parseInt(sb.toString()) * mul.get(color);
                System.out.println(result);
                return;
            }

            sb.append(value.get(color));
        }
    }
}
