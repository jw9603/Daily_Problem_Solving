// 모음사전
// https://school.programmers.co.kr/learn/courses/30/lessons/84512

import java.util.*;

class Problem1 {
    public String[] vowl = {"A", "E", "I", "O", "U"};
    public List<String> words = new ArrayList<>();

    public void makeWord(String s) {
        if (s.length() >= 5) {
            return;
        }

        for (String v : vowl) {
            String w = s + v;
            words.add(w);
            makeWord(w);
        }
    }

    public int solution(String word) {
        int answer = 0;
        makeWord("");
        Collections.sort(words);

        for (int i = 0; i < words.size(); i++) {
            if (word.equals(words.get(i))) {
                answer = i;
            }
        }
        return answer + 1;
    }

    public static void main(String[] args) {
        Problem1 p = new Problem1();
        System.out.println(p.solution("AAAAE"));
    }
}