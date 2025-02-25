# 타겟 넘버
# https://school.programmers.co.kr/learn/courses/30/lessons/43165
def solution(numbers, target):
    
    def dfs(index, total):
        if index == len(numbers):
            return 1 if total == target else 0
        
        return dfs(index + 1, total + numbers[index]) + dfs(index + 1, total - numbers[index])
            
    return dfs(0, 0)

from collections import deque
def solution_bfs(numbers, target):
    queue = deque([(0, 0)]) # index, 현재 값
    cnt = 0
    
    while queue:
        curr_index, curr_sum = queue.popleft()
        
        if curr_index == len(numbers):
            if curr_sum == target:
                cnt += 1
        else:
            queue.append((curr_index + 1, curr_sum + numbers[curr_index]))
            queue.append((curr_index + 1, curr_sum - numbers[curr_index]))
    return cnt

if __name__ == '__main__':
    numbers1, target1 = [1, 1, 1, 1, 1], 3
    numbers2, target2 = [4, 1, 2, 1], 4
    print(f"Result1: {solution(numbers=numbers1, target=target1)}")
    print(f"Result2: {solution(numbers=numbers2, target=target2)}")
    
    print(f"Result1_bfs: {solution_bfs(numbers=numbers1, target=target1)}")
    print(f"Result2_bfs: {solution_bfs(numbers=numbers2, target=target2)}")
