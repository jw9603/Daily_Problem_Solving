# 문자열 내 p와 y의 개수
# https://school.programmers.co.kr/learn/courses/30/lessons/12916
def solution(s):
    return True if s.lower().count('p') == s.lower().count('y') else False

if __name__ == '__main__':
    s1 = "pPoooyY"
    s2 = "Pyy"
    
    print(f"Result1: {solution(s=s1)}")
    print(f"Result2: {solution(s=s2)}")