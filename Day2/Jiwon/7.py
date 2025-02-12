# 하샤드 수
# https://school.programmers.co.kr/learn/courses/30/lessons/12947
def solution(x):
    return True if x % sum(list(map(int, str(x)))) == 0 else False

if __name__ == '__main__':
    x1, x2, x3, x4 = 10, 12, 11, 13
    print(f"Result 1: {solution(x=x1)}")
    print(f"Result 2: {solution(x=x2)}")
    print(f"Result 3: {solution(x=x3)}")
    print(f"Result 4: {solution(x=x4)}")