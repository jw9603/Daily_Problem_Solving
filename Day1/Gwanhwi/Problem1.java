// 연속 부분 수열 합의 개수
// https://school.programmers.co.kr/learn/courses/30/lessons/131701

import java.util.*;

class Problem1 {

    public static Set<Integer> subsequence = new HashSet<>();

    public static void sumNums(int[] elements, int len) {
        int num;

        for (int start = 0; start < elements.length; start++) {
            num = 0;
            for (int idx = start; idx < start + len; idx++) {
                num += elements[idx % elements.length];
            }
            subsequence.add(num);
        }

    }

    public static int countNums(int[] elements) {
        for (int range = 1; range <= elements.length; range++) {
            sumNums(elements, range);
        }
        return subsequence.size();
    }

    public static int solution(int[] elements) {
        return countNums(elements);
    }

    public static void main(String[] args) {
        int[] elements = {7, 9, 1, 1, 4};
        System.out.println(solution(elements));
    }
}