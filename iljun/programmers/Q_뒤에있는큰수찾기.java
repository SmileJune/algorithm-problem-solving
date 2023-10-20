package iljun.programmers;

import java.util.*;

public class Q_뒤에있는큰수찾기 {
    public int[] solution(int[] numbers) {

        Stack<Integer> stack = new Stack<>();

        int[] answer = new int[numbers.length];

        for(int i = answer.length - 1; i >= 0; i--) {
            answer[i] = check(stack, numbers[i]);
        }

        return answer;
    }

    public int check(Stack<Integer> stack, int num) {
        // 비었을 때
        if(stack.isEmpty()) {
            stack.push(num);
            return -1;
        }

        int top = stack.peek();

        // top이 더 클 때
        if(top > num) {
            stack.push(num);
            return top;
        }

        stack.pop();

        // 그 외
        while(!stack.isEmpty()) {
            int up = stack.peek();
            if(up > num) {
                stack.push(num);
                return up;
            }

            stack.pop();
        }

        stack.push(num);
        return -1;

    }
}
