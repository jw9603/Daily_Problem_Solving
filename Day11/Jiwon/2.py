# 롤케이크 자르기
# https://school.programmers.co.kr/learn/courses/30/lessons/132265
def solution(topping):
    left_set = set()
    right_counter = {}
    for t in topping:
        right_counter[t] = right_counter.get(t, 0) + 1
    cnt = 0
    
    for i in range(len(topping)):
        left_set.add(topping[i])
        right_counter[topping[i]] -= 1
        
        if right_counter[topping[i]] == 0:
            del right_counter[topping[i]]
        
        if len(left_set) == len(right_counter):
            cnt += 1
    return cnt

if __name__ == '__main__':
    topping1, topping2 = [1, 2, 1, 3, 1, 4, 1, 2], [1, 2, 3, 1, 4]
    print(f"Result1: {solution(topping=topping1)}")
    print(f"Result2: {solution(topping=topping2)}")