// 자릿수 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12931

public class Problem8 {
    public static int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);

        for (int i = 0; i < num.length(); i++) {
            answer += num.charAt(i) - 48;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(123));
    }
}