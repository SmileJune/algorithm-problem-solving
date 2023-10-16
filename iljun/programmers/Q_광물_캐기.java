package iljun.programmers;

public class Q_광물_캐기 {
    public int solution(int[] picks, String[] minerals) {

        int interval = (minerals.length + 4) / 5;
        int[][] tired = new int[3][interval];

        int idx = 0;
        while(idx < minerals.length) {
            if(minerals[idx].equals("diamond")) {
                tired[0][idx / 5] += 1;
                tired[1][idx / 5] += 5;
                tired[2][idx / 5] += 25;
            } else if(minerals[idx].equals("iron")) {
                tired[0][idx / 5] += 1;
                tired[1][idx / 5] += 1;
                tired[2][idx / 5] += 5;
            } else if(minerals[idx].equals("stone")) {
                tired[0][idx / 5] += 1;
                tired[1][idx / 5] += 1;
                tired[2][idx / 5] += 1;
            }
            idx++;
        }

        int ans = 0;

        for(int i = 0; i < 3; i++) {
            Arrays.sort(tired[i]);
        }

        for(int i = interval - 1; i >= 0; i--) {
            if(picks[0] > 0) {
                ans += tired[0][i];
                picks[0]--;
                continue;
            }

            if(picks[1] > 0) {
                ans += tired[1][i];
                picks[1]--;
                continue;
            }

            if(picks[2] > 0) {
                ans += tired[2][i];
                picks[2]--;
                continue;
            }

            break;
        }

        return ans;
    }
}
