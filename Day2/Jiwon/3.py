# 두 정수 사이의 합
# https://school.programmers.co.kr/learn/courses/30/lessons/12912
def solution(a, b):
    return sum([i for i in range(a, b + 1)]) if a < b else sum([i for i in range(b, a + 1)])

if __name__ == '__main__':
    a1, b1 = 3, 5
    a2, b2 = 3, 3
    a3, b3 = 5, 3
    
    print(f"Result 1: {solution(a=a1, b=b1)}")
    print(f"Result 2: {solution(a=a2, b=b2)}")
    print(f"Result 3: {solution(a=a3, b=b3)}")