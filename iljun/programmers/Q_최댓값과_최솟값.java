package iljun.programmers;

import java.util.*;

public class Q_최댓값과_최솟값 {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        List<Integer> list = new ArrayList<>();
        while(st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);

        return list.get(0) + " " + list.get(list.size() - 1);
    }
}
