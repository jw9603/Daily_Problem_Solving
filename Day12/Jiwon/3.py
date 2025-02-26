# 네트워크
# https://school.programmers.co.kr/learn/courses/30/lessons/43162
###################################### BFS ######################################
from collections import deque
def solution_bfs(n, computers):
    
    def bfs(start_node):
        queue = deque([start_node])
        visited[start_node] = True
        
        while queue:
            cur_node = queue.popleft()
            for next_node in range(n):
                if computers[cur_node][next_node] == 1 and not visited[next_node]:
                    visited[next_node] = True
                    queue.append(next_node)
            
    visited = [False] * n
    cnt = 0
    
    for i in range(n):
        if not visited[i]:
            bfs(i)
            cnt += 1
    return cnt
###################################### BFS ######################################

##################################### DFS #######################################
def solution_dfs(n, computers):
    def dfs(node):
        visited[node] = True
        for next_node in range(n):
            if computers[node][next_node] == 1 and not visited[next_node]:
                dfs(next_node)
    visited = [False] * n
    cnt = 0
    
    for i in range(n):
        if not visited[i]:
            dfs(i)
            cnt += 1
    return cnt
###################################### DFS ######################################

if __name__ == '__main__':
    
    n1, computers1 = 3, [[1, 1, 0], [1, 1, 0], [0, 0, 1]]
    n2, computers2 = 3, [[1, 1, 0], [1, 1, 1], [0, 1, 1]]
    
    print(f"Result1 using BFS: {solution_bfs(n=n1, computers=computers1)}")
    print(f"Result2 using BFS: {solution_bfs(n=n2, computers=computers2)}")
    print(f"Result1 using DFS: {solution_dfs(n=n1, computers=computers1)}")
    print(f"Result2 using DFS: {solution_dfs(n=n2, computers=computers2)}")