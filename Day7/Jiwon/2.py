# 기능개발
# https://school.programmers.co.kr/learn/courses/30/lessons/42586
from collections import deque
from math import ceil
def solution(progresses, speeds):
    days = deque([ceil((100 - progresses[i]) / speeds[i]) for i in range(len(progresses))])
    answer = []
    
    while days:
        cnt = 1
        deploy_days = days.popleft()
        while days and days[0] <= deploy_days:
            days.popleft()
            cnt += 1
        answer.append(cnt)
    return answer

if __name__ == '__main__':
    progress1, speeds1 = [93, 30, 55],	[1, 30, 5]
    progress2, speeds2 = [95, 90, 99, 99, 80, 99],	[1, 1, 1, 1, 1, 1]
    print(f"Result1: {solution(progresses=progress1, speeds=speeds1)}")
    print(f"Result2: {solution(progresses=progress2, speeds=speeds2)}")