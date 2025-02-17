// 폰켓몬
// https://school.programmers.co.kr/learn/courses/30/lessons/1845

import java.util.*;

class Problem1 {
    public static int solution(int[] nums) {
        Set<Integer> sorts = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            sorts.add(nums[i]);
        }

        return Math.min(sorts.size(), nums.length / 2);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 2, 3};
        System.out.println(solution(nums));
    }
}