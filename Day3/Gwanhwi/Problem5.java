// 없는 숫자 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/86051

class Problem5 {
    public static int solution(int[] numbers) {
        int answer = 45;
        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 6, 7, 8, 0};
        System.out.println(solution(numbers));
    }
}