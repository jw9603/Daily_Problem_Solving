// 음양 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/76501

class Problem6 {
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] absolutes = new int[]{4, 7, 12};
        boolean[] signs = new boolean[]{true, false, true};
        System.out.println(solution(absolutes, signs));
    }
}