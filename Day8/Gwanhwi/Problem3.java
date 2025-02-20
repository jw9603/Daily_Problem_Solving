// 전화번호 목록
// https://school.programmers.co.kr/learn/courses/30/lessons/42577

import java.util.*;

class Problem3 {
    public boolean solution(String[] phone_book) {
        Set<String> numbers = new HashSet<>();

        for (String num : phone_book) {
            numbers.add(num);
        }

        for (String num : phone_book) {
            for (int i = 1; i < num.length(); i++) {
                if (numbers.contains(num.substring(0, i))) {
                    return false;
                }
            }
        }
        // System.out.println(numbers);
        return true;
    }

    public static void main(String[] args) {
        Problem3 problem3 = new Problem3();
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(problem3.solution(phone_book));
    }
}