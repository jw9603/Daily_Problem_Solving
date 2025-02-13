# 할인 행사
# https://school.programmers.co.kr/learn/courses/30/lessons/131127
from collections import Counter
def solution(want, number, discount):
    cnt = 0
    want_dict = {}
    for w, n in zip(want, number):
        want_dict[w] = n
    for i in range(len(discount) - 9):
        dis_cnt = Counter(discount[i:i + 10])
        if want_dict == dis_cnt:
            cnt += 1
        
    return cnt

if __name__ == '__main__':
    want1, number1, discount1 = ["banana", "apple", "rice", "pork", "pot"], [3, 2, 2, 2, 1], ["chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"]
    want2, number2, discount2 = ["apple"], [10], ["banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"]
    
    print(f"Result1: {solution(want=want1, number=number1, discount=discount1)}")
    print(f"Result2: {solution(want=want2, number=number2, discount=discount2)}")
    