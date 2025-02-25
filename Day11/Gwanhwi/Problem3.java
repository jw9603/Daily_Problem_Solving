// 게임 맵 최단거리
// https://school.programmers.co.kr/learn/courses/30/lessons/1844

import java.util.*;

class Problem3 {
    public int[][] maps;
    public boolean[][] visited;

    public boolean isRange(int x, int y) {
        return x >= 0 && x < maps.length && y >= 0 && y < maps[0].length;
    }

    public void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (isRange(nx, ny) && !visited[nx][ny] && maps[nx][ny] == 1) {
                    queue.offer(new int[]{nx, ny});
                    maps[nx][ny] = maps[x][y] + 1;
                    visited[nx][ny] = true;
                }
            }
        }
    }

    public int solution(int[][] maps) {
        this.maps = maps;
        visited = new boolean[maps.length][maps[0].length];

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length; j++) {
                if (maps[i][j] == 0) {
                    visited[i][j] = true;
                }
            }
        }

        bfs();
        int answer = maps[maps.length - 1][maps[0].length - 1];
        if (answer == 1) {
            return -1;
        } else {
            return answer;
        }
    }

    public static void main(String[] args) {
        Problem3 problem3 = new Problem3();
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        System.out.println(problem3.solution(maps));
    }
}