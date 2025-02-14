// 부족한 금액 계산하기
// https://school.programmers.co.kr/learn/courses/30/lessons/82612

class Problem7 {
    public static long solution(int price, int money, int count) {
        long total = 0;

        for (int i = 1; i < count + 1; i++) {
            total += (long) (price * i);
        }

        if (total < money) {
            return 0;
        } else {
            return total - money;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }
}