// 방문 길이
// https://school.programmers.co.kr/learn/courses/30/lessons/49994?language=java

import java.util.*;

class Problem1 {
    public int solution(String dirs) {
        int answer = 0;
        List<Integer> dir = new ArrayList<>();
        Set<List<Integer>> loc = new HashSet<>();

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (char c : dirs.toCharArray()) {
            if (c == 'U') {
                dir.add(3);
            } else if (c == 'D') {
                dir.add(2);
            } else if (c == 'L') {
                dir.add(0);
            } else {
                dir.add(1);
            }
        }

        int x = 0;
        int y = 0;
        int nx;
        int ny;

        for (int d : dir) {
            nx = x + dx[d];
            ny = y + dy[d];
            if (nx <= 5 && nx >= -5 && ny <= 5 && ny >= -5) {
                loc.add(Arrays.asList(x, y, nx, ny));
                loc.add(Arrays.asList(nx, ny, x, y));
                x = nx;
                y = ny;
            }
        }

        return loc.size() / 2;
    }

    public static void main(String[] args) {
        Problem1 p = new Problem1();
        System.out.println(p.solution("ULURRDLLU"));
        System.out.println(p.solution("LULLLLLLU"));
    }
}