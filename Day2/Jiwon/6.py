# 정수 제곱근 판별
# https://school.programmers.co.kr/learn/courses/30/lessons/12934
def solution(n):
    for i in range(1, int(n ** 0.5) + 1):
        if i ** 2 == n:
            return (i + 1) ** 2
    return -1

if __name__ == '__main__':
    n1, n2 = 121, 3
    print(f"Result1: {solution(n=n1)}")
    print(f"Result2: {solution(n=n2)}")