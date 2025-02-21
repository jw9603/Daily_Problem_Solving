// 과일 장수
// https://school.programmers.co.kr/learn/courses/30/lessons/135808

import java.util.*;

class Problem2 {

    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int num = 0;
        int minNum = Integer.MAX_VALUE;

        for (int i = score.length - 1; i > -1; i--) {
            num++;
            minNum = Math.min(minNum, score[i]);
            if (num % m == 0) {
                answer += num * minNum;
                num = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem2 p = new Problem2();
        int[] score = {1, 2, 3, 1, 2, 3, 1};
        System.out.println(p.solution(3, 4, score));
    }
}