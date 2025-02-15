# 직사각형 별찍기
# https://school.programmers.co.kr/learn/courses/30/lessons/12969
a, b = map(int, input().strip().split(' '))
for _ in range(b):
    for _ in range(a):
        print('*',end='')
    print()