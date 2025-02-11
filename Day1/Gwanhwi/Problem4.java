// 짝수와 홀수
// https://school.programmers.co.kr/learn/courses/30/lessons/12937?language=java

class Problem4 {
    public static String solution(int num) {
        if (num % 2 == 0) {
            return "Even";
        }
        else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(3));
    }
}