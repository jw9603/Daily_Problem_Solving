// 모의고사
// https://school.programmers.co.kr/learn/courses/30/lessons/42840

import java.util.*;

class Problem3 {
    public int maxNum = 0;

    public int countAnswer(int[] person, int[] answers) {
        int cnt = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person[i % person.length]) {
                cnt++;
            }
        }
        maxNum = Math.max(maxNum, cnt);
        return cnt;
    }

    public int[] solution(int[] answers) {
        int[] answer = new int[4];
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};


        answer[1] = countAnswer(person1, answers);
        answer[2] = countAnswer(person2, answers);
        answer[3] = countAnswer(person3, answers);

        List<Integer> highScorePersonList = new ArrayList<>();
        for (int i = 1; i < answer.length; i++) {
            if (answer[i] == maxNum) {
                highScorePersonList.add(i);
            }
        }

        int[] highScorePerson = new int[highScorePersonList.size()];
        for (int i = 0; i < highScorePersonList.size(); i++) {
            highScorePerson[i] = highScorePersonList.get(i);
        }

        return highScorePerson;
    }

    public static void main(String[] args) {
        Problem3 problem3 = new Problem3();
        int[] answer = {1, 2, 3, 4, 5};
        int[] highScorePerson = problem3.solution(answer);
        System.out.println(Arrays.toString(highScorePerson));
    }
}