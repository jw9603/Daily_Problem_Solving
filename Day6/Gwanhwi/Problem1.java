// H-Index
// https://school.programmers.co.kr/learn/courses/30/lessons/42747

class Problem1 {

    private static int[] citations;

    public static boolean findH(int num) {
        int quotations = 0;
        int beQuotations = 0;

        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= num) {
                quotations++;
            } else {
                beQuotations++;
            }
        }
        return quotations >= num && beQuotations <= num;
    }

    public static int solution(int[] citations) {
        Problem1.citations = citations;

        for (int i = 10000; i > 0; i--) {
            if (findH(i)) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] citations = new int[]{3, 0, 6, 1, 5};
        System.out.println(solution(citations));
    }
}