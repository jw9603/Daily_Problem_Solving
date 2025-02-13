// 서울에서 김서방 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/12919

import java.util.*;

class Problem3 {
    public static String solution(String[] seoul) {
        String answer;
        int location = -1;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                location = i;
            }
        }

        answer = "김서방은 " + Integer.toString(location) + "에 있다";
        return answer;
    }

    public static void main(String[] args) {
        String[] seoul = new String[]{"Jane", "Kim"};
        System.out.println(solution(seoul));
    }
}