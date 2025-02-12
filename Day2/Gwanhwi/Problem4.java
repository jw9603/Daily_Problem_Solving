// 문자열 내 p와 y의 개수
// https://school.programmers.co.kr/learn/courses/30/lessons/12916

class Problem4 {
    public static boolean solution(String s) {
        s = s.toLowerCase();
        int pNums = 0;
        int yNums = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.charAt(i) == 'y') {
                yNums++;
            }
            else if (s.charAt(i) == 'p') {
                pNums++;
            }
        }

        if (pNums == yNums) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
    }
}