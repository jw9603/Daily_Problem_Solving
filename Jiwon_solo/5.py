# JadenCase 문자열 만들기
# https://school.programmers.co.kr/learn/courses/30/lessons/12951

def solution1(s):
    return ' '.join(word[:1].upper() + word[1:].lower() for word in s.split())

def solution2(s):
    return ' '.join(word.capitalize() for word in s.split(' '))

if __name__ == '__main__':
    
    s1, s2 = "3people unFollowed me", "for the last week"
    
    print(f"Result1 about solution1: {solution1(s=s1)}")
    print(f"Result1 about solution2: {solution2(s=s1)}")
    print(f"Result2 about solution1: {solution1(s=s2)}")
    print(f"Result2 about solution2: {solution2(s=s2)}")
        