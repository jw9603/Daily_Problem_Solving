# 의상
# https://school.programmers.co.kr/learn/courses/30/lessons/42578
from collections import Counter
def solution(clothes):
    count = Counter(type for _, type in clothes)
    answer = 1
    for cnt in count.values():
        answer *= (cnt + 1)
    return answer - 1
if __name__ == '__main__':
    clothes1 = [["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]
    clothes2 = [["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]]
    
    print(f"Result1: {solution(clothes=clothes1)}")
    print(f"Result2: {solution(clothes=clothes2)}")