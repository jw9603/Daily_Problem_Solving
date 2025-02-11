# 연속 부분 수열 합의 개수
# https://school.programmers.co.kr/learn/courses/30/lessons/131701

def solution(elements):

    result = set()
    length = len(elements)
    elements *= 2
    
    for i in range(length):
        for j in range(length):
            result.add(sum(elements[j:i + j + 1]))
    return len(result)

if __name__ == '__main__':
    
    elements = [7, 9, 1, 1, 4]
    
    print(f"Result1: {solution(elements=elements)}")