# 자연수 뒤집어 배열로 만들기
# https://school.programmers.co.kr/learn/courses/30/lessons/12932
def solution(n):
    return list(map(int, str(n)[::-1]))

if __name__ == '__main__':
    n = 12345
    print(f"Result 1: {solution(n=n)}")