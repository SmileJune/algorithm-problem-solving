package iljun.programmers;

public class Q_카펫 {
    public int[] solution(int brown, int yellow) {
        int distance = (brown - 8) / 2;
        int garo = 1 + distance;
        int sero = 1;

        while(true) {
            if (garo * sero == yellow) {
                break;
            }

            garo -= 1;
            sero += 1;
        }
        return new int[]{garo + 2, sero + 2};
    }
}
