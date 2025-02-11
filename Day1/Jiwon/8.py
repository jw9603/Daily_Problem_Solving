# 자릿수 더하기
# https://school.programmers.co.kr/learn/courses/30/lessons/12931
def solution(n):
    return sum(map(int, list(str(n))))
if __name__ == '__main__':
    n1, n2 = 123, 987
    print(f"Result 1: {solution(n=n1)}")
    print(f"Result 2: {solution(n=n2)}")