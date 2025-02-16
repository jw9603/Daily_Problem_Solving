# 최솟값 만들기
# https://school.programmers.co.kr/learn/courses/30/lessons/12941?language=python3
def solution(A,B):
    return sum([i * j for i,j in zip(sorted(A, reverse=True), sorted(B))])

if __name__ == '__main__':
    A1, B1 = [1, 4, 2],	[5, 4, 4]
    A2, B2 = [1,2],	[3,4]
    
    print(f"Result1: {solution(A=A1, B=B1)}")
    print(f"Result2: {solution(A=A2, B=B2)}")