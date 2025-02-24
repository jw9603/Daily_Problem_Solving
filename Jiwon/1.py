# 소수 찾기
# https://school.programmers.co.kr/learn/courses/30/lessons/12921
def solution(n):
    sosu = [True] * (n + 1)
    sosu[0] = sosu[1] = False
    
    for i in range(2, int(n ** 0.5) + 1):
        if sosu[i]:
            for j in range(i * i, n + 1, i):
                sosu[j] = False
    return sum(sosu)

if __name__ == '__main__':
    n1, n2 = 10, 5
    print(f"Result1: {solution(n=n1)}")
    print(f"Result2: {solution(n=n2)}")