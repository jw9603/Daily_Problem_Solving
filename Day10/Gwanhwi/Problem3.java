// [1차] 뉴스 클러스터링
// https://school.programmers.co.kr/learn/courses/30/lessons/17677

import java.util.*;

class Problem3 {

    public Map<String, Integer> strA = new HashMap<>();
    public Map<String, Integer> strB = new HashMap<>();
    public Map<String, Integer> union = new HashMap<>();
    public Map<String, Integer> intersection = new HashMap<>();

    public boolean isAlp(String s) {
        if (s.charAt(0) < 'a' || s.charAt(0) > 'z') {
            return false;
        }
        if (s.charAt(1) < 'a' || s.charAt(1) > 'z') {
            return false;
        }
        return true;
    }

    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for (int i = 0; i < str1.length() - 1; i++) {
            String s = str1.substring(i, i + 2);
            if (isAlp(s)) {
                if (strA.containsKey(s)) {
                    strA.put(s, strA.get(s) + 1);
                    union.put(s, strA.get(s));
                } else {
                    strA.put(s, 1);
                    union.put(s, 1);
                }
            }
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            String s = str2.substring(i, i + 2);
            if (isAlp(s)) {
                if (strB.containsKey(s)) {
                    strB.put(s, strB.get(s) + 1);
                } else {
                    strB.put(s, 1);
                }
            }
        }

        for (String s : strB.keySet()) {
            if (strA.containsKey(s)) {
                intersection.put(s, Math.min(strA.get(s), strB.get(s)));
                union.put(s, Math.max(strA.get(s), strB.get(s)));
            } else {
                union.put(s, strB.get(s));
            }
        }

        int totalIntersection = 0;
        int totalUnion = 0;

        for (Integer num : intersection.values()) {
            totalIntersection += num;
        }
        for (Integer num : union.values()) {
            totalUnion += num;
        }

        if (totalUnion == 0) {
            return 65536;
        }

        int answer = totalIntersection * 65536 / totalUnion;
        return answer;
    }

    public static void main(String[] args) {
        Problem3 problem3 = new Problem3();
        System.out.println(problem3.solution("FRANCE", "french"));
    }
}