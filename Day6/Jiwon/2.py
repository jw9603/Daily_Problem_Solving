# 기사단원의 무기
# https://school.programmers.co.kr/learn/courses/30/lessons/136798
def count(num):
    cnt = 0
    for i in range(1, int(num ** 0.5) + 1):
        if num % i == 0:
            cnt += 1
            if i != num // i:
                cnt += 1
    return cnt

def solution(number, limit, power):
    return sum(count(num) if count(num) <= limit else power for num in range(1, number + 1))

if __name__ == '__main__':
    number1, limit1, power1 = 5, 3, 2
    number2, limit2, power2 = 10, 3, 2
    print(f"Result1: {solution(number=number1, limit=limit1, power=power1)}")
    print(f"Result2: {solution(number=number2, limit=limit2, power=power2)}")