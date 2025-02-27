# 방문 길이
# https://school.programmers.co.kr/learn/courses/30/lessons/49994
def solution(dirs):
    move = {"U": (0, 1), "D": (0, -1), "R": (1, 0), "L": (-1, 0)}
    x, y = 0, 0
    visited = set()
    
    for d in dirs:
        next_x, next_y = x + move[d][0], y + move[d][1]
        if -5 <= next_x <= 5 and -5 <= next_y <= 5:
            visited.add((x, y, next_x, next_y))
            visited.add((next_x, next_y, x, y))
            x, y = next_x, next_y
        
    return len(visited) // 2

if __name__ == '__main__':
    dirs1, dirs2 = "ULURRDLLU", "LULLLLLLU"
    print(f"Result1: {solution(dirs=dirs1)}")
    print(f"Result2: {solution(dirs=dirs2)}")
    