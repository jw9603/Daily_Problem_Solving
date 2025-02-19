// 기능개발
// https://school.programmers.co.kr/learn/courses/30/lessons/42586

import java.util.*;

class Problem2 {

    public boolean isBigger(int currentDate, int day) {
        return currentDate >= day;
    }

    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int day;
        int currentDay = 0;
        int work = 0;

        for (int i = 0; i < progresses.length; i++) {
            int restProgress = 100 - progresses[i];
            day = restProgress / speeds[i];
            if (restProgress % speeds[i] > 0) {
                day++;
            }
            if (i == 0) {
                currentDay = day;
            }
            if (isBigger(currentDay, day)) {
                work++;
            } else {
                answer.add(work);
                work = 1;
                currentDay = day;
            }
        }
        answer.add(work);
        int[] answerToArr = new int[answer.size()];

        for (int i = 0; i < answer.size(); i++) {
            answerToArr[i] = answer.get(i);
        }
        return answerToArr;
    }

    public static void main(String[] args) {
        Problem2 problem = new Problem2();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] answer = problem.solution(progresses, speeds);
        System.out.println(Arrays.toString(answer));
    }
}