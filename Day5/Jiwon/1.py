# 폰켓몬
# https://school.programmers.co.kr/learn/courses/30/lessons/1845
def solution(nums):
    return min(len(set(nums)), len(nums)//2)

if __name__ == '__main__':
    nums1, nums2, nums3 = [3,1,2,3], [3,3,3,2,2,4], [3,3,3,2,2,2]
    print(f"Result1: {solution(nums=nums1)}")
    print(f"Result2: {solution(nums=nums2)}")
    print(f"Result3: {solution(nums=nums3)}")