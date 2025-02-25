// 소수 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12977

class Problem2 {

    public int[] nums;

    public int answer = 0;

    public boolean isPrime(int num) {
        int len = (int) Math.sqrt(num);

        for (int i = 2; i <= len; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public void dfs(int total, int idx, int n) {
        if (n == 3) {
            if (isPrime(total)) {
                answer++;
            }
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            dfs(total + nums[i], i + 1, n + 1);
        }
    }

    public int solution(int[] nums) {
        this.nums = nums;
        dfs(0, 0, 0);

        return answer;
    }

    public static void main(String[] args) {
        Problem2 problem = new Problem2();
        int[] nums = {1, 2, 3, 4};
        System.out.println(problem.solution(nums));
    }
}