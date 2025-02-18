// 기사단원의 무기
// https://school.programmers.co.kr/learn/courses/30/lessons/136798

class Problem2 {
    public static int countMeasure(int num) {
        int root = (int) Math.sqrt(num);
        int cnt = 0;
        for (int i = 1; i < root + 1; i++) {
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

    public static int solution(int number, int limit, int power) {
        int answer = 0;
        int cnt;
        for (int i = 1; i < number + 1; i++) {
            cnt = countMeasure(i);
            if (cnt > limit) {
                answer += power;
            } else {
                answer += cnt;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 3, 2));
    }
}