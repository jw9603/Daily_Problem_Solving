# 제일 작은 수 제거하기
# https://school.programmers.co.kr/learn/courses/30/lessons/12935
def solution(arr):
    m = min(arr)
    return [i for i in arr if i != m] if len(arr) > 1 else [-1]
if __name__ == '__main__':
    arr1, arr2 = [4,3,2,1], [10]
    print(f"Result1: {solution(arr=arr1)}")
    print(f"Result2: {solution(arr=arr2)}")