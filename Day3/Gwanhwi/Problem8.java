// 핸드폰 번호 가리기
// https://school.programmers.co.kr/learn/courses/30/lessons/12948?language=java

class Problem8 {
    public static String solution(String phone_number) {
        String hideWord = phone_number.substring(0, phone_number.length() - 4);
        String star = "";
        for (int i = 0; i < hideWord.length(); i++) {
            star += "*";
        }
        return phone_number.replaceAll(hideWord, star);
    }

    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
    }
}