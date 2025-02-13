// 제일 작은 수 제거하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12935

import java.util.Arrays;

class Problem7 {
    public static int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int[] answer = new int[arr.length - 1];
        int minNum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            minNum = Math.min(minNum, arr[i]);
        }

        int idx = 0;
        int arrIdx = 0;
        while (idx < answer.length) {
            if (arr[arrIdx] != minNum) {
                answer[idx] = arr[arrIdx];
                idx++;
            }
            arrIdx++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 2, 1};
        int[] answer = solution(arr);
        System.out.println(Arrays.toString(answer));
    }
}