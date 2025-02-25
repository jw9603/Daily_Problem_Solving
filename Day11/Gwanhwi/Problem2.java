// 롤케이크 자르기
// https://school.programmers.co.kr/learn/courses/30/lessons/132265

import java.util.*;

class Problem2 {
    public int solution(int[] topping) {
        int answer = 0;

        Set<Integer> chulsu = new HashSet<>();
        Map<Integer, Integer> son = new HashMap<>();
        int sonSorts = 0;
        for (int t : topping) {
            if (son.containsKey(t)) {
                son.put(t, son.get(t) + 1);
            } else {
                son.put(t, 1);
                sonSorts++;
            }
        }

        for (int t : topping) {
            chulsu.add(t);
            son.put(t, son.get(t) - 1);
            if (son.get(t) == 0) {
                sonSorts--;
            }
            if (chulsu.size() == sonSorts) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem2 problem = new Problem2();
        System.out.println(problem.solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2}));
    }
}