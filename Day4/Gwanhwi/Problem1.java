// n^2 배열 자르기
// https://school.programmers.co.kr/learn/courses/30/lessons/87390

import java.util.*;

class Problem1 {
    public static int[] solution(int n, long left, long right) {
        int range = (int) (right - left + 1);
        int[] answer = new int[range];

        for (long i = left; i < right + 1; i++) {
            int row = (int) (i / n);
            int col = (int) (i % n);
            answer[(int) (i - left)] = Math.max(row, col) + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answer = solution(3, 2, 5);
        System.out.println(Arrays.toString(answer));
    }
}