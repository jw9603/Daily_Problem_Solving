# 같은 숫자는 싫어
# https://school.programmers.co.kr/learn/courses/30/lessons/12906
def solution1(arr):
    return arr[0:1] + [arr[i] for i in range(1, len(arr)) if arr[i] != arr[i - 1]]

def solution2(arr):
    stack = [arr[0]]
    for i in range(1, len(arr)):
        if stack[-1] != arr[i]:
            stack.append(arr[i])
    return stack

if __name__ == '__main__':
    arr1, arr2 = [1,1,3,3,0,1,1], [4,4,4,3,3]
    
    print(f"Result1 about solution1: {solution1(arr=arr1)}")
    print(f"Result1 about solution2: {solution2(arr=arr1)}")
    print(f"Result2 about solution1: {solution1(arr=arr2)}")
    print(f"Result2 about solution2: {solution2(arr=arr2)}")