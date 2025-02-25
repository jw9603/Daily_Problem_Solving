# 게임 맴  최단거리
# https://school.programmers.co.kr/learn/courses/30/lessons/1844
from collections import deque
def solution(maps):
    directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
    
    n, m = len(maps), len(maps[0])    
    queue = deque([(0, 0, 1)])
    visited = [[False] * m for _ in range(n)]
    visited[0][0] = True
    while queue:
        cur_x, cur_y, cur_d = queue.popleft()
        
        if cur_x == n - 1 and cur_y == m - 1:
            return cur_d
        
        for dx, dy in directions:
            next_x, next_y = cur_x + dx, cur_y + dy
            
            if 0 <= next_x < n and 0 <= next_y < m:
                if maps[next_x][next_y] == 1 and not visited[next_x][next_y]:
                    visited[next_x][next_y] = True
                    queue.append((next_x, next_y, cur_d + 1))
    return -1

if __name__ == '__main__':
    maps1 = [[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,1],[0,0,0,0,1]]
    maps2 = [[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,0],[0,0,0,0,1]]
    
    print(f"Result1: {solution(maps=maps1)}")
    print(f"Result2: {solution(maps=maps2)}")