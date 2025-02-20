// 튜플
// https://school.programmers.co.kr/learn/courses/30/lessons/64065

import java.util.*;

class Problme2 {
    public int[] solution(String s) {
        s = s.substring(1, s.length() - 1);
        String[] numString = s.split("},");
        for (int i = 0; i < numString.length; i++) {
            numString[i] = numString[i].substring(1);
            if (i == numString.length - 1) {
                numString[i] = numString[i].substring(0, numString[i].length() - 1);
            }
        }
        String[][] nums = new String[numString.length][];
        int[] cnts = new int[nums.length];
        for (int i = 0; i < numString.length; i++) {
            nums[i] = numString[i].split(",");
        }
        Arrays.sort(nums, Comparator.comparingInt(o -> o.length));
        int[] answer = new int[nums.length];
        answer[0] = Integer.parseInt(nums[0][0]);

        for (int i = 1; i < nums.length; i++) {
            for (String n : nums[i]) {
                boolean tf = false;
                for (int num : answer) {
                    if (num == Integer.parseInt(n)) {
                        tf = true;
                    }
                }
                if (!tf) {
                    answer[i] = Integer.parseInt(n);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Problme2 p = new Problme2();
        int[] result = p.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");
        System.out.println(Arrays.toString(result));
    }
}