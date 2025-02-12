// 괄호 회전하기
// https://school.programmers.co.kr/learn/courses/30/lessons/76502

import java.util.*;

class Problem1 {

    public static boolean isCorrect(Deque<Character> brackets) {
        Deque<Character> stack = new LinkedList<>();

        for (char ch : brackets) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }

    public static int solution(String s) {
        int answer = 0;
        Deque<Character> dq = new LinkedList<>();

        for (char c : s.toCharArray()) {
            dq.offer(c);
        }

        for (int i = 0; i < s.length(); i++) {
            dq.offer(dq.pollFirst());
            if (isCorrect(dq)) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
    }
}