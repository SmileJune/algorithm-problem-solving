package iljun.programmers;

import java.util.*;

public class Q_짝지어_제거하기 {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            //스택 보고 같은 것이라면 들어있던 것을 빼고 아니라면 넣는다.
            if(!stack.isEmpty() && (stack.peek() == ch)) {
                stack.pop();
                continue;
            }

            // 아니라면
            stack.push(ch);
        }

        // 다 끝난 뒤에 stack에 남아있다면 0을 리턴
        if(stack.isEmpty()) {
            return 1;
        }

        return 0;
    }
}
