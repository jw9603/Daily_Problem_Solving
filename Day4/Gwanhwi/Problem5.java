// 약수의 개수와 덧셈
// https://school.programmers.co.kr/learn/courses/30/lessons/77884?language=java

class Problem5 {
    public static int countMeasure(int num) {
        int root = (int) Math.sqrt(num);
        int cnt = 0;
        for(int i = 1; i < root + 1; i++) {
            if (num % i == 0) {
                cnt++;
            }
        }
        if (root * root == num) {
            return cnt * 2 - 1;
        } else {
            return cnt * 2;
        }
    }

    public static int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i < right + 1; i++) {
            int cnt = countMeasure(i);
            if (cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(13, 17));
    }
}