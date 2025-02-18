# H-index
# https://school.programmers.co.kr/learn/courses/30/lessons/42747
def solution(citations):
    citations.sort()
    n = len(citations)
    for i in range(n):
        h = n - i
        if citations[i] >= h:
            return h
    return 0

if __name__ == '__main__':
    citations1 = [3, 0, 6, 1, 5]
    print(f"Result1: {solution(citations=citations1)}")