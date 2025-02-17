// 의상
// https://school.programmers.co.kr/learn/courses/30/lessons/42578

import java.util.*;

class Problem3 {
    public static int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> sorts = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            if(sorts.containsKey(clothes[i][1])) {
                sorts.put(clothes[i][1], sorts.get(clothes[i][1]) + 1);
            } else {
                sorts.put(clothes[i][1], 2);
            }
        }

        for (Integer value : sorts.values()) {
            answer *= value;
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }
}