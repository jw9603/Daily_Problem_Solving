# 가운데 글자 가져오기
# https://school.programmers.co.kr/learn/courses/30/lessons/12903
def solution(s):
    return s[len(s) // 2 - 1: len(s) // 2 + 1] if len(s) % 2 == 0 else s[len(s)//2]

if __name__ == '__main__':
    s1, s2 = 'abcde', 'qwer'
    print(f"Result1: {solution(s=s1)}")
    print(f"Result2: {solution(s=s2)}")
    