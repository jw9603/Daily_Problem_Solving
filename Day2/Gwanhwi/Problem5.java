// 정수 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12933?language=java

import java.util.*;

class Problem5 {
    public static long solution(long n) {
        String s = Long.toString(n);
        Long[] nums = new Long[s.length()];
        for (int i = 0; i < s.length(); i++) {
            nums[i] = Long.valueOf(s.charAt(i) - '0');
        }
        Arrays.sort(nums, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (Long num : nums) {
            sb.append(num);
        }

        long answer = Long.parseLong(sb.toString());
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(118327));
    }
}