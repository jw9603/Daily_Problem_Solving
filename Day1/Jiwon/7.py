# 나머지가 1이 되는 수 찾기
# https://school.programmers.co.kr/learn/courses/30/lessons/87389
def solution(n):
    return [x for x in range(1, n + 1) if n % x == 1][0]

if __name__ == '__main__':
    n1, n2 = 10, 12
    print(f"Result1 : {solution(n=n1)}")
    print(f"Result2 : {solution(n=n2)}")