// 실패율
// https://school.programmers.co.kr/learn/courses/30/lessons/42889

import java.util.*;

class Problem1 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] stageCnt = new int[N + 2];
        List<double[]> failure = new ArrayList<>();
        int users = stages.length;

        for (int stage : stages) {
            stageCnt[stage] += 1;
        }

        for (int i = 1; i < N + 1; i++) {
            if (users > 0) {
                failure.add(new double[]{(double) stageCnt[i] / users, i});
            } else {
                failure.add(new double[]{0, i});
            }
            users -= stageCnt[i];
        }

        failure.sort((a, b) -> {
            if (Double.compare(b[0], a[0]) != 0) {
                return Double.compare(b[0], a[0]); // 첫 번째 요소 내림차순
            } else {
                return Double.compare(a[1], b[1]); // 두 번째 요소 오름차순
            }
        });

//         for (double[] array : failure) {
//             System.out.println(Arrays.toString(array));
//         }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) failure.get(i)[1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] answer = problem1.solution(5, stages);
        System.out.println(Arrays.toString(answer));
    }
}