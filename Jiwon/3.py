# 뉴스 클러스터링
# https://school.programmers.co.kr/learn/courses/30/lessons/17677
from collections import Counter
def is_alpha_pair(pair):
    return pair[0].isalpha() and pair[1].isalpha()

def make_multiset(s):
    s = s.lower()
    multiset = []
    
    for i in range(len(s) - 1):
        pair = s[i:i + 2]
        if is_alpha_pair(pair):
            multiset.append(pair)
    return Counter(multiset)

def solution(str1, str2):
    set1, set2 = make_multiset(str1), make_multiset(str2)
    
    intersection = sum((set1 & set2).values())
    union = sum((set1 | set2).values())
    
    jaccard_similarity = 1 if not union else intersection / union
    return int(jaccard_similarity * 65536)

if __name__ == '__main__':
    a1, b1 = "FRANCE", "french"
    a2, b2 = "handshake", "shake hands"
    a3, b3 = "aa1+aa2", "AAAA12"
    a4, b4 = "E=M*C^2", "e=m*c^2"
    
    print(f"Result1: {solution(str1=a1, str2=b1)}")
    print(f"Result2: {solution(str1=a2, str2=b2)}")
    print(f"Result3: {solution(str1=a3, str2=b3)}")
    print(f"Result4: {solution(str1=a4, str2=b4)}")
    