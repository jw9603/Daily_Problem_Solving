# 덧칠하기
# https://school.programmers.co.kr/learn/courses/30/lessons/161989
def solution(n, m, section):
    cnt = 0
    current_end = 0
    
    for s in section:
        if s > current_end:
            cnt += 1
            current_end = s + m - 1
    return cnt

if __name__ == '__main__':
    n1, m1, section1 = 8, 4, [2, 3, 6]
    n2, m2, section2 = 5, 4, [1, 3]
    n3, m3, section3 = 4, 1, [1, 2, 3, 4]
    print(f"Result1: {solution(n=n1, m=m1, section=section1)}")
    print(f"Result2: {solution(n=n2, m=m2, section=section2)}")
    print(f"Result3: {solution(n=n3, m=m3, section=section3)}")