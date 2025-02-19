// [1차] 캐시
// https://school.programmers.co.kr/learn/courses/30/lessons/17680?language=java#

import java.util.*;

class Problem1 {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        int answer = 0;
        Deque<String> cache = new ArrayDeque<>(cacheSize);

        for (String city : cities) {
            String cityLower = city.toLowerCase();
            if (cache.remove(cityLower)) {
                answer += 1;
            } else {
                answer += 5;
                if (cache.size() == cacheSize) {
                    cache.pollLast();
                }
            }
            cache.addFirst(cityLower);
        }
        return answer;
    }

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        System.out.println(problem1.solution(3, cities));

    }
}

