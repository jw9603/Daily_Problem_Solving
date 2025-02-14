// 문자열 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12917

import java.util.*;

class Problem6 {
    public static String solution(String s) {
        String answer = "";
        String[] arr = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = String.valueOf(s.charAt(i));
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return String.join("", arr);
    }

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
}