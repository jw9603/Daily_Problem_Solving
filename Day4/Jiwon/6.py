# 부족한 금액 계산하기
# https://school.programmers.co.kr/learn/courses/30/lessons/82612
def solution(price, money, count):
    return max(sum([price * i for i in range(1, count + 1)]) - money, 0)
if __name__ == '__main__':
    price, money, count = 3, 20, 4
    print(f"Result1: {solution(price=price, money=money, count=count)}")