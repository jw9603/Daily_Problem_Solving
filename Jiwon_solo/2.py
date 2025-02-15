# 최댓갑과 최솟값
# https://school.programmers.co.kr/learn/courses/30/lessons/12939
def solution(s):
    s = list(map(int, s.split(' ')))
    return ' '.join(map(str, [min(s), max(s)]))

if __name__ == '__main__':
    s1, s2, s3 = "1 2 3 4", "-1 -2 -3 -4", "-1 -1"
    print(f"Result1: {solution(s=s1)}")
    print(f"Result2: {solution(s=s2)}")
    print(f"Result3: {solution(s=s3)}")