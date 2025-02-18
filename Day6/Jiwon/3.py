# 2016년
# https://school.programmers.co.kr/learn/courses/30/lessons/12901
def solution(a, b):
    day_cnt = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    day_name = ["FRI", "SAT", "SUN", "MON", 'TUE', 'WED', 'THU']
    return day_name[(sum(day_cnt[:a - 1]) + b - 1) % 7]
    
if __name__ == '__main__':
    a1, b1 = 5, 24
    print(f"Result1: {solution(a=a1, b=b1)}")