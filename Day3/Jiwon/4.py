# 콜라츠 추측
# https://school.programmers.co.kr/learn/courses/30/lessons/12943
def collatz(num, count=0):
    if num == 1:
        return count
    if count >= 500:
        return -1
    if num % 2 == 0:
        return collatz(num // 2, count + 1)
    else:
        return collatz(num * 3 + 1, count + 1)
def solution(num):
    return collatz(num)

if __name__ == '__main__':
    n1, n2, n3 = 6, 16, 626331
    print(f"Result1: {solution(num=n1)}")
    print(f"Result2: {solution(num=n2)}")
    print(f"Result3: {solution(num=n3)}")