// 평균 구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12944

class Problem5 {
    public static double solution(int[] arr) {
        double answer = 0;

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(solution(arr));
    }
}