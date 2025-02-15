# 행렬의 덧셈
# https://school.programmers.co.kr/learn/courses/30/lessons/12950
def solution(arr1, arr2):
    for i in range(len(arr1)):
        for j in range(len(arr1[0])):
            arr1[i][j] += arr2[i][j]
    return arr1

if __name__ == '__main__':
    arr1, arr2 = [[1,2],[2,3]],	[[3,4],[5,6]]
    arr11, arr21 = [[1],[2]]	[[3],[4]]
    print(f"Result1: {solution(arr1=arr1, arr2=arr2)}")
    print(f"Result2: {solution(arr1=arr11, arr2=arr21)}")