# 올바른 괄호
# https://school.programmers.co.kr/learn/courses/30/lessons/12909
def solution(s):
    stack = []
    flag = True
    for char in s:
        if char == '(':
            stack.append(char)
        else:
            if not stack or stack[-1] != '(':
                flag = False
                break
            stack.pop()
    return True if not stack and flag else False

if __name__ == '__main__':
    s1, s2, s3, s4 = "()()", "(())()", ")()(", "(()("
    print(f"Result1: {solution(s=s1)}")
    print(f"Result2: {solution(s=s2)}")
    print(f"Result3: {solution(s=s3)}")
    print(f"Result4: {solution(s=s4)}")