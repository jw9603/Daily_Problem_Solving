# x만큼 간격이 있는 n개의 숫자
# https://school.programmers.co.kr/learn/courses/30/lessons/12954
def solution(x, n):
    return [x*i for i in range(1,n+1)]

if __name__ == '__main__':
    x1, n1 = 2, 5
    x2, n2 = 4, 3
    x3, n3 = -4, 2
    print(f"Result1: {solution(x1, n1)}")
    print(f"Result2: {solution(x2, n2)}")
    print(f"Result3: {solution(x3, n3)}")
    