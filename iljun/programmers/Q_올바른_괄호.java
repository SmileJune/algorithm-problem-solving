package iljun.programmers;

import java.util.*;

public class Q_올바른_괄호 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        try {
            for(int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                check(stack, ch);
            }
        } catch(Exception e) {
            return false;
        }

        if(!stack.isEmpty()) {
            return false;
        }

        return true;
    }

    void check(Stack<Character> stack, char ch) throws Exception {
        // 만약 '(' 라면 집어 넣는다.
        if(ch == '(') {
            stack.push(ch);
            return;
        }

        // 만약 ')' 라면 빼서 확인한다.
        char top = stack.pop();
        if(top == '(') {
            return;
        }

        // 만약 없다면 예외가 발생해서 False가 리턴될 것이다.
    }
}
