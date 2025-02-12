# 괄호 회전하기
# https://school.programmers.co.kr/learn/courses/30/lessons/76502
def is_valid(s):
    pair = {')':'(', '}':'{', ']':'['}
    stack = []
    for char in s:
        if char in '({[':
            stack.append(char)
        else:
            if not stack or stack[-1] != pair[char]:
                return False
            stack.pop()
    return len(stack) == 0
            
def solution(s):
    cnt = 0
    n = len(s)
    for i in range(n):
        rotated_s = s[i:] + s[:i]
        if is_valid(rotated_s):
            cnt += 1
    return cnt


if __name__ == '__main__':
    s1 = "[](){}"
    s2 = "}]()[{"
    s3 = '[)(]'
    s4 = "}}}"
    
    print(f"Result 1: {solution(s=s1)}")
    print(f"Result 2: {solution(s=s2)}")
    print(f"Result 3: {solution(s=s3)}")
    print(f"Result 4: {solution(s=s4)}")
    