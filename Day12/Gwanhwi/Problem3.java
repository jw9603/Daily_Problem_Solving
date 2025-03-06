// 네트워크
// https://school.programmers.co.kr/learn/courses/30/lessons/43162

import java.util.*;

class Problem3 {
    public int[][] computers;
    public boolean[] visited;

    public void bfs(int s) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(s);
        visited[s] = true;

        while (!dq.isEmpty()) {
            int start = dq.poll();
            for (int i = 0; i < computers[start].length; i++) {
                if (!visited[i] && computers[start][i] == 1) {
                    visited[i] = true;
                    dq.add(i);
                }
            }
        }
    }

    public int solution(int n, int[][] computers) {
        int answer = 0;
        this.computers = computers;
        visited = new boolean[n];

        for (int computer = 0; computer < n; computer++) {
            if (!visited[computer]) {
                bfs(computer);
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Problem3 problem3 = new Problem3();
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(problem3.solution(3, computers));
    }
}