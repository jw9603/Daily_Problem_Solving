// 두 정수 사이의 합
// https://school.programmers.co.kr/learn/courses/30/lessons/12912

class Problem3 {
    public static long solution(int a, int b) {
        long answer = 0;
        long minNum = Math.min(a, b);
        long maxNum = Math.max(a, b);

        for (long num = minNum; num < maxNum + 1; num ++) {
            answer += num;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 5));
    }
}