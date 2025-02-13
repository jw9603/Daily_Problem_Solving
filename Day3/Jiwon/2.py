# 나누어 떨어지는 숫자 배열
# https://school.programmers.co.kr/learn/courses/30/lessons/12910
def solution(arr, divisor):
    result = sorted([i for i in arr if i % divisor == 0]) 
    return result if result else [-1]
if __name__ == '__main__':
    arr1, divisor1 = [5, 9, 7, 10],	5
    arr2, divisor2 = [2, 36, 1, 3],	1
    arr3, divisor3 = [3, 2, 6],	10
    
    print(f"Result1: {solution(arr=arr1, divisor=divisor1)}")
    print(f"Result2: {solution(arr=arr2, divisor=divisor2)}")
    print(f"Result3: {solution(arr=arr3, divisor=divisor3)}")