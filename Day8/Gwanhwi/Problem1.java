// 피로도
// https://school.programmers.co.kr/learn/courses/30/lessons/87946

import java.util.*;

class Problem1 {

    private int[][] dungeons;

    private boolean[] visited;

    public int maxNum = 0;

    public void dfs(int k, int n) {
        boolean isVisited = false;
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                isVisited = true;
                visited[i] = true;
                dfs(k - dungeons[i][1], n + 1);
                visited[i] = false;
            }
        }
        if (!isVisited) {
            maxNum = Math.max(n, maxNum);
        }
    }

    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        visited = new boolean[dungeons.length];
        dfs(k, 0);

        return maxNum;
    }

    public static void main(String[] args) {
        Problem1 p = new Problem1();
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        System.out.println(p.solution(80, dungeons));
    }
}