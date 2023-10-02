package iljun.programmers;

import java.util.*;

public class Q_JadenCase_문자열_만들기 {
    public String solution(String s) {

        StringTokenizer st = new StringTokenizer(s);
        StringBuilder sb = new StringBuilder();

        while(st.hasMoreTokens()) {
            String str = st.nextToken();
            char ch = str.charAt(0);

            //문자일 때
            if(65 <= ch) {
                sb.append((ch + "").toUpperCase());
            }

            //숫자일 때
            if('0' <= ch && ch <= '9') {
                sb.append(ch);
            }

            sb.append(str.substring(1).toLowerCase());
            sb.append(" ");
        }

        if(s.substring(s.length()-1, s.length()).equals(" ")){
            return sb.toString();
        }

        return sb.toString().substring(0, sb.length() - 1);
}
