# 약수의 합
# https://school.programmers.co.kr/learn/courses/30/lessons/12928
def solution(n):
    return sum([i for i in range(1, n + 1) if n % i == 0])

def solution(n):
    if n == 0:
        return 0
    
    divisor_sum = 0
    for i in range(1, int(n **0.5) + 1):
        if n % i == 0:
            divisor_sum += i
            if i != n // i:
                divisor_sum += n // i
    return divisor_sum

if __name__ == '__main__':
    n1 = 12
    n2 = 5
    
    print(f"Result 1: {solution(n=n1)}")
    print(f"Result 2: {solution(n=n2)}")