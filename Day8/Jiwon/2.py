# 튜플
# https://school.programmers.co.kr/learn/courses/30/lessons/64065
from collections import Counter
def solution(s):
    num = ''
    num_list = []
    
    for char in s:
        if char.isdigit():
            num += char
        elif num:
            num_list.append(int(num))
            num = ''
    freq = Counter(num_list)
    sorted_nums = sorted(freq, key=lambda x: (-freq[x]))

    return sorted_nums

if __name__ == '__main__':
    s1 = "{{2},{2,1},{2,1,3},{2,1,3,4}}"
    s2 = "{{1,2,3},{2,1},{1,2,4,3},{2}}"
    s3 = "{{20,111},{111}}"
    s4 = "{{123}}"
    s5 = "{{4,2,3},{3},{2,3,4,1},{2,3}}"
    
    print(f"Result1: {solution(s=s1)}")
    print(f"Result2: {solution(s=s2)}")
    print(f"Result3: {solution(s=s3)}")
    print(f"Result4: {solution(s=s4)}")
    print(f"Result5: {solution(s=s5)}")