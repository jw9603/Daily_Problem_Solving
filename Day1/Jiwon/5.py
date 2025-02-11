# 짝수와 홀수
# https://school.programmers.co.kr/learn/courses/30/lessons/12937
def solution(num):
    return "Even" if num % 2 == 0 else "Odd"

if __name__ == '__main__':
    num1, num2 = 3, 4
    print(f"Result 1: {solution(num=num1)}")
    print(f"Result 2: {solution(num=num2)}")