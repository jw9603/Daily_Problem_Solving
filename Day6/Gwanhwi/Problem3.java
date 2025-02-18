// 2016년
// https://school.programmers.co.kr/learn/courses/30/lessons/12901?language=java

class Problem3 {
    public static String solution(int a, int b) {
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = 0;

        for (int i = 1; i < a; i++) {
            day += months[i];
        }
        day += b;

        return days[day % 7];
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 24));
    }
}