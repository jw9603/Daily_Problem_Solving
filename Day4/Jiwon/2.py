# 내적
# https://school.programmers.co.kr/learn/courses/30/lessons/70128
def solution(a, b):
    return sum([i * j for i,j in zip(a, b)])
if __name__ == '__main__':
    a1, b1 = [1,2,3,4], [-3,-1,0,2]
    a2, b2 = [-1,0,1],	[1,0,-1]
    print(f"Result1: {solution(a=a1, b=b1)}")
    print(f"Result2: {solution(a=a2, b=b2)}")