// x만큼 간격이 있는 n개의 숫자
// https://school.programmers.co.kr/learn/courses/30/lessons/12954
import java.util.Arrays;

class Problem6 {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = 0;

        for (int i = 0; i < n; i++) {
            num += x;
            answer[i] = num;
        }

        return answer;
    }

    public static void main(String[] args) {
        long[] answer = solution(2, 5);
        System.out.println(Arrays.toString(answer));
    }
}