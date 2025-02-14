# n^2 배열 자르기
# https://school.programmers.co.kr/learn/courses/30/lessons/87390
def solution(n, left, right):
    return [max(i // n, i % n) + 1 for i in range(left, right + 1)]

if __name__ == '__main__':
    n1, left1, right1 = 3, 2, 5
    n2, left2, right2 = 4, 7 ,14
    print(f"Result1: {solution(n=n1, left=left1, right=right1)}")
    print(f"Result2: {solution(n=n2, left=left2, right=right2)}")