# 문자열 다루기 기본
# https://school.programmers.co.kr/learn/courses/30/lessons/12918
def solution(s):
    return True if (len(s) == 4 or len(s) == 6) and s.isdigit()== True else False
if __name__ == '__main__':
    s1, s2 = "a234", "1234"
    print(f"Result1: {solution(s=s1)}")
    print(f"Result2: {solution(s=s2)}")