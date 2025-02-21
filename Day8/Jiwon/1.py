# 피로도
# https://school.programmers.co.kr/learn/courses/30/lessons/87946
from itertools import permutations
def solution(k, dungeons):
    max_cnt = 0

    for perm in permutations(dungeons):
        current_k = k
        cnt = 0

        for min_required, cost in perm:
            if min_required <= current_k:
                current_k -= cost
                cnt += 1
            else:
                break
        max_cnt = max(max_cnt, cnt)
    return max_cnt

if __name__ == '__main__':
    k1, dungeons1 = 80, [[80,20],[50,40],[30,10]]
    print(f"Result1: {solution(k=k1, dungeons=dungeons1)}")