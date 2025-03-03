# 옹알이 (2)
# https://school.programmers.co.kr/learn/courses/30/lessons/133499
def solution(babbling):
    words = ["aya", "ye", "woo", "ma"]
    cnt = 0
    
    for word in babbling:
        for w in words:
            if  w * 2 not in word:
                word = word.replace(w, ' ')
        
        if word.strip() == '':
            cnt += 1
    return cnt

if __name__ == '__main__':
    babbling1, babbling2 = ["aya", "yee", "u", "maa"], ["ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"]
    
    print(f"Result1: {solution(babbling=babbling1)}")
    print(f"Result2: {solution(babbling=babbling2)}")