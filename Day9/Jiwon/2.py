# 과일 장수
# https://school.programmers.co.kr/learn/courses/30/lessons/135808
def solution(k, m, score):
    score.sort(reverse=True)
    answer = 0
    for i in range(0, len(score), m):
        if len(score[i:i + m]) == m:
            answer += min(score[i:i + m]) * m
    return answer

if __name__ == '__main__':
    k1, m1, score1 = 3, 4, [1, 2, 3, 1, 2, 3, 1]
    k2, m2, score2 = 4, 3, [4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2]
    print(f"Result1: {solution(k=k1, m=m1, score=score1)}")
    print(f"Result2: {solution(k=k2, m=m2, score=score2)}")