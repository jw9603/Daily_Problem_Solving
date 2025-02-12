// 자연수 뒤집어 배열로 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12932

import java.util.*;

class Problem2 {
    public static int[] solution(long n) {
        String s = Long.toString(n);
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            answer[i] = s.charAt(s.length() - i - 1) - '0';
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answer = solution(12345);
        System.out.println(Arrays.toString(answer));
    }
}