// 정수 제곱근 판별
// https://school.programmers.co.kr/learn/courses/30/lessons/12934

class Problem6 {

    public static boolean isSquareRoot(long num) {
        double decimalPoint = Math.sqrt(num);
        long intNum = (long) Math.sqrt(num);
        return decimalPoint - intNum == 0;
    }

    public static long solution(long n) {
        if (isSquareRoot(n)) {
            long sqrt = (long) Math.sqrt(n);
            return (sqrt + 1) * (sqrt + 1);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(121));
    }
}