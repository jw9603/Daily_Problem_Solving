# 프로세스
# https://school.programmers.co.kr/learn/courses/30/lessons/42587

from collections import deque
def solution(priorities, location):
    queue = deque((i, p) for i, p in enumerate(priorities))
    result = []
    while queue:
        
        process = queue.popleft()
        
        if any(process[1] < q[1] for q in queue):
            queue.append(process)
        else:
            result.append(process)
    return [idx + 1 for idx, process in enumerate(result) if process[0] == location][0]

if __name__ == '__main__':
    priorities1, locations1 = [2, 1, 3, 2], 2
    priorities2, locations2 = [1, 1, 9, 1, 1, 1], 0
    print(f"Result1: {solution(priorities=priorities1, location=locations1)}")
    print(f"Result2: {solution(priorities=priorities2, location=locations2)}")