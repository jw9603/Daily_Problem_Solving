# 실패율
# https://school.programmers.co.kr/learn/courses/30/lessons/42889
def solution(N, stages):
    
    total_players = len(stages)
    
    stage_counts = [0] * (N + 2)
    
    for stage in stages:
        stage_counts[stage] += 1
    
    fail_rate = []
    remaining_players = total_players
    for i in range(1, N + 1):
        if remaining_players > 0:
            fail_rate.append((stage_counts[i] / remaining_players, i))
        else:
            fail_rate.append((0, i))
        remaining_players -= stage_counts[i]
    
    fail_rate.sort(key=lambda x: (-x[0], x[1]))

    return [stage for _, stage in fail_rate]

if __name__ == '__main__':
    N1, stages1 = 5, [2, 1, 2, 6, 2, 4, 3, 3]
    N2, stages2 = 4, [4, 4, 4, 4, 4]
    print(f"Result1: {solution(N=N1, stages=stages1)}")
    print(f"Result2: {solution(N=N2, stages=stages2)}")