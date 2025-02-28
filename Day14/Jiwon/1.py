# 모음사전
# https://school.programmers.co.kr/learn/courses/30/lessons/84512
################################# 재귀 ##############################
def solution(word):
    result = []
    words = 'AEIOU'
    def dfs(cnt, w):
        
        if cnt == 5:
            return
        for i in range(len(words)):
            result.append(w + words[i])
            dfs(cnt + 1, w + words[i])
    dfs(0, '')
    return result.index(word) + 1

if __name__ == '__main__':
    word1, word2, word3, word4 = "AAAAE", "AAAE", "I", "EIO"
    print(f"Result1: {solution(word=word1)}")
    print(f"Result2: {solution(word=word2)}")
    print(f"Result3: {solution(word=word3)}")
    print(f"Result4: {solution(word=word4)}")
################################# 재귀 ##############################

################################# 중복 순열 ##############################
from itertools import product
def solution(word):
    result = []
    vowels = ["A", "E", "I", "O", "U"]
    for i in range(5):
        for j in product(vowels, repeat=i + 1):
            result.append(''.join(j))
    result.sort()
    return result.index(word) + 1

if __name__ == '__main__':
    word1, word2, word3, word4 = "AAAAE", "AAAE", "I", "EIO"
    print(f"Result1: {solution(word=word1)}")
    print(f"Result2: {solution(word=word2)}")
    print(f"Result3: {solution(word=word3)}")
    print(f"Result4: {solution(word=word4)}")         
    
################################# 중복 순열 ##############################