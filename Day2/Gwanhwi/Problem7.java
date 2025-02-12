// 하샤드 수
// https://school.programmers.co.kr/learn/courses/30/lessons/12947

class Problem7 {
    public static boolean solution(int x) {
        String s = Integer.toString(x);

        int total = 0;
        for (int i = 0 ; i < s.length(); i++) {
            total += s.charAt(i) - '0';
        }

        return x % total == 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}