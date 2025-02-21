// 덧칠하기
// https://school.programmers.co.kr/learn/courses/30/lessons/161989

import java.util.*;

class Problem3 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] wall = new boolean[n + 1];
        for (int idx : section) {
            wall[idx] = true;
        }
        // System.out.println(Arrays.toString(wall));

        for (int i = 0; i < wall.length; i++) {
            if (wall[i]) {
                answer++;
                for (int j = i; j < Math.min(i + m, wall.length); j++) {
                    wall[j] = false;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Problem3 problem3 = new Problem3();
        int[] section = {2, 3, 6};

        System.out.println(problem3.solution(8, 4, section));
    }
}