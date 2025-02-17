// 행렬의 곱셈
// https://school.programmers.co.kr/learn/courses/30/lessons/12949?language=java


import java.util.*;

class Problem2 {
    public static int calNum(int[][] arr2, int col, int[] arr1) {
        int num = 0;

        for (int j = 0; j < arr1.length; j++) {
            num += arr1[j] * arr2[j][col];
        }

        return num;
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        int num;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                num = calNum(arr2, j, arr1[i]);
                // System.out.println(num);
                answer[i][j] = num;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        int[][] answer = solution(arr1, arr2);
        System.out.println(Arrays.deepToString(answer));
    }
}