// 소수 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/12921

class Problem1 {

    public boolean isPrime(int num) {
        int len = (int) Math.sqrt(num);

        for (int i = 2; i < len + 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int solution(int n) {
        int answer = 1;

        for (int i = 3; i < n + 1; i++) {
            if (isPrime(i)) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        System.out.println(problem1.solution(10));
    }
}