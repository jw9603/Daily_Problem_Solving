# 소수 만들기
# https://school.programmers.co.kr/learn/courses/30/lessons/12977
from itertools import combinations
def check_sosu(n):
    sosu = [True] * (n + 1)
    sosu[0] = sosu[1] = False
    
    for i in range(2, int(n ** 0.5) + 1):
        if sosu[i]:
            for j in range(i * i, n + 1, i):
                sosu[j] = False
    return sosu[n]

def solution(nums):
    cnt = 0
    for comb in combinations(nums, 3):
        if check_sosu(sum(comb)):
            cnt += 1
    return cnt

if __name__ == '__main__':
    nums1, nums2 = [1, 2, 3, 4], [1, 2, 7, 6, 4]
    print(f"Result1: {solution(nums=nums1)}")
    print(f"Result2: {solution(nums=nums2)}")
    