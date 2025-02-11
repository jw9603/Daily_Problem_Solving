# 자릿수 더하기
# https://school.programmers.co.kr/learn/courses/30/lessons/12931
def solution(n):
    return sum(map(int, list(str(n))))

if __name__ == '__main__':
    N1 = 123
    N2 = 987
    
    print(f"Result 1: {solution(n=N1)}")
    print(f"Result 2: {solution(n=N2)}")