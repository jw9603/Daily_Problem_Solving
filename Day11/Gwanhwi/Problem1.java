// 타겟 넘버
// https://school.programmers.co.kr/learn/courses/30/lessons/43165?language=java

class Problem1 {

    int[] numbers;
    int answer;

    void dfs(int tar, int n, int cnt) {
        if (cnt == numbers.length) {
            if (n == tar) {
                answer++;
            }
            return;
        }

        dfs(tar, n + numbers[cnt], cnt + 1);
        dfs(tar, n - numbers[cnt], cnt + 1);
    }

    public int solution(int[] numbers, int target) {
        this.numbers = numbers;

        dfs(target, 0, 0);
        return answer;
    }

    public static void main(String[] args) {
        Problem1 p = new Problem1();
        System.out.println(p.solution(new int[]{1, 1, 1, 1, 1}, 3));
    }
}