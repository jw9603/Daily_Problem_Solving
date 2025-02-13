# 없는 숫자 더하기
# https://school.programmers.co.kr/learn/courses/30/lessons/86051
def solution(numbers):
    numbers = set(numbers)
    return sum([i for i in range(0, 10) if i not in numbers])
if __name__ == '__main__':
    numbers1, numbers2 = [1,2,3,4,6,7,8,0], [5,8,4,0,6,7,9]
    print(f"Result1: {solution(numbers=numbers1)}")
    print(f"Result2: {solution(numbers=numbers2)}")