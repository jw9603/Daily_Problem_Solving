# 수박수박수박수박수박수?
# https://school.programmers.co.kr/learn/courses/30/lessons/12922
def solution(n):
    return ('수박' * n)[:n]
if __name__ == '__main__':
    n1, n2 = 3, 4
    print(f"Result1: {solution(n=n1)}")
    print(f"Result2: {solution(n=n2)}")