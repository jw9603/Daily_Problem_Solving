# 음양 더하기
# https://school.programmers.co.kr/learn/courses/30/lessons/76501
def solution(absolutes, signs):
    return sum([absolutes[i] if signs[i] else -absolutes[i] for i in range(len(absolutes))])

if __name__ == '__main__':
    absolutes1, signs1 = [4,7,12],	[True, False, True]
    absolutes2, signs2 = [1,2,3],	[False, False, True]
    print(f"Result1: {solution(absolutes=absolutes1, signs=signs1)}")
    print(f"Result2: {solution(absolutes=absolutes2, signs=signs2)}")