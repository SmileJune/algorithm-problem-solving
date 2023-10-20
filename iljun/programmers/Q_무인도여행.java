package iljun.programmers;

import java.util.*;

public class Q_무인도여행 {
    boolean[][] visited;
    List<Integer> list = new ArrayList<>();
    int[] dr = new int[]{0, -1, 1, 0};
    int[] dc = new int[]{1, 0, 0, -1};
    int rowSize, columnSize;
    int[][] map;

    public int[] solution(String[] maps) {
        rowSize = maps.length;
        columnSize = maps[0].length();

        map = new int[rowSize][columnSize];
        visited = new boolean[rowSize][columnSize];

        // map 배열 만들기
        for(int i = 0; i < rowSize; i++) {
            String str = maps[i];
            for(int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if(ch == 'X'){
                    visited[i][j] = true;
                    continue;
                }

                map[i][j] = ch - '0';
            }
        }

        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {

                int sum = check(i, j);
                if(sum == 0) {
                    continue;
                }

                list.add(sum);
            }
        }

        if(list.size() == 0) {
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    public int check(int i, int j) {
        // 방문했다면 종료
        if(visited[i][j] == true) {
            return 0;
        }

        visited[i][j] = true;
        int sum = map[i][j];

        // 방문 안했다면 체크 시작
        for(int d = 0; d < 4; d++) {
            int nr = i + dr[d];
            int nc = j + dc[d];

            if(nr < 0 || rowSize <= nr || nc < 0 || columnSize <= nc) {
                continue;
            }
            sum += check(nr, nc);
        }
        return sum;
    }
}
