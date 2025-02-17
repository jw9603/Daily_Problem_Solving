# 행렬의 곱셈
# https://school.programmers.co.kr/learn/courses/30/lessons/12949
def solution(arr1, arr2):
    a, b = len(arr1), len(arr1[0])
    c = len(arr2[0])
    result = [[0] * c for _ in range(a)]
    
    for i in range(a):
        for j in range(c):
            for k in range(b):
                result[i][j] += arr1[i][k] * arr2[k][j]
    return result

if __name__ == '__main__':
    arr11, arr12 = [[1, 4], [3, 2], [4, 1]], [[3, 3], [3, 3]]
    
    arr21, arr22 = [[2, 3, 2], [4, 2, 4], [3, 1, 4]],	[[5, 4, 3], [2, 4, 1], [3, 1, 1]]
    
    print(f"Result1: {solution(arr1=arr11, arr2=arr12)}")
    print(f"Result2: {solution(arr1=arr21, arr2=arr22)}")