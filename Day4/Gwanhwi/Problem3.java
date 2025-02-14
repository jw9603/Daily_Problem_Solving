// 가운데 글자 가져오기
// https://school.programmers.co.kr/learn/courses/30/lessons/12903

class Problem3 {
    public static String solution(String s) {
        int len = s.length();
        int mid = len / 2;
        if (len % 2 == 1) {
            return s.substring(mid, mid + 1);
        } else {
            return s.substring(mid - 1, mid + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("abcde"));
    }
}