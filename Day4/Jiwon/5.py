# 약수의 개수와 덧셈
# https://school.programmers.co.kr/learn/courses/30/lessons/77884
def solution(left, right):
    return sum([-i if int(i ** 0.5) ** 2 == i else i for i in range(left, right + 1)])
if __name__ == '__main__':
    left1, right1 = 13, 17
    left2, right2 = 24, 27
    print(f"Result1: {solution(left=left1, right=right1)}")
    print(f"Result2: {solution(left=left2, right=right2)}")