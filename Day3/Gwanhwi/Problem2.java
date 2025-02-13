// 나누어 떨어지는 숫자 배열
// https://school.programmers.co.kr/learn/courses/30/lessons/12910

import java.util.*;

class Problem2 {
    public static int[] solution(int[] arr, int divisor) {
        List<Integer> nums = new ArrayList<>();

        Arrays.sort(arr);
        for(int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] % divisor == 0) {
                nums.add(arr[idx]);
            }
        }

        int[] answer;
        if (nums.size() > 0) {
            answer = nums.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        } else {
            answer = new int[]{-1};
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 9, 7, 10};
        int divisor = 5;
        int[] answer = solution(arr, divisor);
        System.out.println(Arrays.toString(answer));
    }
}