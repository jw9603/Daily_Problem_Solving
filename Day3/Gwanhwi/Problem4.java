// 콜라츠 추측
// https://school.programmers.co.kr/learn/courses/30/lessons/12943

class Problem4 {
    public static int solution(int n) {
        long num = n;
        int rep = 0;
        if (num == 1) {
            return 0;
        }

        while (rep < 501 && num != 1) {
            rep++;
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num *= 3;
                num++;
            }
        }

        if (rep > 500) {
            return -1;
        }
        return rep;
    }

    public static void main(String[] args) {
        System.out.println(solution(6));
    }
}