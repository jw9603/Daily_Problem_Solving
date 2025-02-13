// 할인 행사
// https://school.programmers.co.kr/learn/courses/30/lessons/131127

import java.util.*;

class Problem1 {

    public static Map<String, Integer> goods = new HashMap<String, Integer>();

    public static boolean canBuy(int[]number, int startDay, String[] discount) {
        int[] result = new int[number.length];

        for (int day = startDay; day < startDay + 10; day++) {
            if (goods.containsKey(discount[day])) {
                result[goods.get(discount[day])] += 1;
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] != number[i]) {
                return false;
            }
        }

        return true;
    }

    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        for (int i = 0; i < want.length; i++) {
            goods.put(want[i], i);
        }

        for (int i = 0; i < discount.length - 9; i++) {
            if (canBuy(number, i, discount)) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] want = new String[] {"banana", "apple", "rice", "pork", "pot"};
        int[] number = new int[] {3, 2, 2, 2, 1};
        String[] discount = new String[] {"chicken", "apple", "apple", "banana",
                                          "rice", "apple", "pork", "banana", "pork",
                                          "rice", "pot", "banana", "apple", "banana"};
        System.out.println(solution(want, number, discount));
    }
}