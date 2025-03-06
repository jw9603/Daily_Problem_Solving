// 정수 삼각형
// https://school.programmers.co.kr/learn/courses/30/lessons/43105

class Problem2 {
    public int solution(int[][] triangle) {
        int answer = 0;
        int len = triangle.length;
        int[][] dp = new int[500][500];
        dp[0][0] = triangle[0][0];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (i != len - 1) {
                    dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j] + triangle[i + 1][j]);
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], dp[i][j] + triangle[i + 1][j + 1]);
                } else {
                    answer = Math.max(answer, dp[i][j]);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem2 problem2 = new Problem2();
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.out.println(problem2.solution(triangle));
    }
}