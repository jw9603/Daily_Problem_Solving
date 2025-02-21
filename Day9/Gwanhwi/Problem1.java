// 프로세스
// https://school.programmers.co.kr/learn/courses/30/lessons/42587

import java.util.*;

class Problem1 {

    public LinkedList<Integer> processes = new LinkedList<>();

    public LinkedList<Integer> priority = new LinkedList<>();

    public int processing() {
        int process = processes.poll();
        int p = priority.poll();

        for (int i = 0; i < processes.size(); i++) {
            if (priority.get(i) > p) {
                processes.add(process);
                priority.add(p);
                return -1;
            }
        }
        return process;
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;

        for (int i = 0; i < priorities.length; i++) {
            processes.add(i);
            priority.add(priorities[i]);
        }

        while (!processes.isEmpty()) {
            int outNum = processing();
            if (outNum == -1) {
                continue; // 현재 작업을 뒤로 미뤘으므로 다음 반복으로 넘어감
            }
            answer++;
            if (outNum == location) {
                break; // 원하는 작업이 처리되었으므로 종료
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem1 p = new Problem1();
        int[] priorities = new int[]{2, 1, 3, 2};
        System.out.println(p.solution(priorities, 2));
    }
}